package com.edp.admin.planTasks;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.edp.admin.common.BaseController;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.DateUtil;
import com.edp.dao.domain.TaskInfoPo;
import com.edp.serviceI.dto.PlanTasksDto;
import com.edp.serviceI.dto.TaskInfoDto;
import com.edp.serviceI.dto.TaskTraceDto;
import com.edp.serviceI.dto.UserDto;
import com.edp.serviceI.planTasks.PlanTasksServiceI;
import com.edp.serviceI.taskInfo.TaskInfoServiceI;
import com.edp.serviceI.taskTrace.TaskTraceServiceI;
import com.edp.serviceI.user.UserServiceI;
import org.h2.table.Plan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * 计划工单控制类
 * Created by changer on 16/8/5.
 */

@Controller
@RequestMapping("/planTasks")
public class PlanTasksController extends BaseController {


    @Resource
    private PlanTasksServiceI planTasksServiceI;

    @Resource
    private TaskInfoServiceI taskInfoServiceI;

    @Resource
    private TaskTraceServiceI taskTraceServiceI;

    @Resource
    private UserServiceI userServiceI;

    /**
     * 条件查询
     * @param condition
     * @return
     */
    @RequestMapping(value = "/queryAllPlanTasks", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public PlanTasksDto queryAllPlanTasks(PlanTasksDto condition,HttpSession httpSession) {
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

//        if (condition != null) {

            //获取当前登录人信息
            UserDto userDetail = this.getUserDetail(httpSession);
            String userName = userDetail.getUserName();
            int userId = userDetail.getId();
            //根据角色设置数据查询过滤
//            List<String> roles = userServiceI.SelectRoleById(userName);

//            if(!roles.contains("6")){
//                if(roles.contains("3")){//只是普通的开发人员，只能查看分配给自己的工单
//                    condition.setTaskOwner(String.valueOf(userId));
//                }else if(roles.contains("4")){//测试人员,只查看工单状态已完成的工单
//                    condition.setTaskState(EDPCodeConstants.TASK_STATE_DONE);
//                }
//            }
//
//
//            rtnDto = planTasksServiceI.queryAllPlanTasksByCondition(condition);
//
//        } else {
//            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
//            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
//        }


        return rtnDto;
    }

    /**
     * 根据主键查询计划工单
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public PlanTasksDto findById(int id) {
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        if (id > 0) {
            rtnDto = planTasksServiceI.findTaskInfoByprimaryKey(id);
        } else {
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
        }

        return rtnDto;
    }

    /**
     * 保存计划工单
     * @param planTasks
     * @return
     */
    @RequestMapping(value = "/save", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public PlanTasksDto save(PlanTasksDto planTasks,HttpSession httpSession) {
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();


        if (planTasks != null) {
            UserDto userDetail = this.getUserDetail(httpSession);
            planTasks.setTaskCreateUser(userDetail.getUserName());
            planTasks.setTaskCreateTime(DateUtil.time2String(new Date()));
            rtnDto = planTasksServiceI.savePlanTaskInfo(planTasks);
        } else {
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
        }

        return rtnDto;
    }


    /**
     * 批量保存计划工单
     * @param ids
     * @param planId
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/patchSave", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public PlanTasksDto patchSave(String ids,String planId,HttpSession httpSession){

        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();




        if(StringUtils.isNotEmpty(ids) && StringUtils.isNotEmpty(planId)){

            TaskInfoDto taskInfoDto = taskInfoServiceI.queryTaskInfosByIds(ids);

            List<TaskInfoDto> taskInfos = taskInfoDto.getRows();

            List<PlanTasksDto> planTasks = BeanCopyUtils.populateTListbyDListBySpring(taskInfos,PlanTasksDto.class);


            UserDto userDetail = this.getUserDetail(httpSession);
            String userName = userDetail.getUserName();

            String currDate = DateUtil.time2String(new Date());

            //设置planId、createUser
            for(PlanTasksDto pd:planTasks){
                pd.setId(null);//防止ID覆盖
                pd.setPlanId(planId);
                pd.setTaskCreateUser(userName);
                pd.setTaskCreateTime(currDate);
            }

            rtnDto = planTasksServiceI.savePlanTaskInfosByPatch(planTasks);

        }else{
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
        }


        return rtnDto;


    }

    /**
     * 更新计划工单
     * @param planTasks
     * @return
     */
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public PlanTasksDto update(PlanTasksDto planTasks,HttpSession httpSession) {
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        if (planTasks != null && planTasks.getId() != null) {
            //更新计划工单表
            UserDto userDetail = this.getUserDetail(httpSession);
            planTasks.setTaskLastModifyor(userDetail.getUserName());
            planTasks.setTaskLastModifiedTime(DateUtil.time2String(new Date()));
            rtnDto = planTasksServiceI.updatePlanTaskInfo(planTasks);
            //更新工单池工单信息

            TaskInfoDto task = BeanCopyUtils.populateTbyDBySpring(planTasks,TaskInfoDto.class);
            task.setId(null);
            taskInfoServiceI.updateTaskInfo(task);
        } else {
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
        }

        return rtnDto;
    }


    /**
     * 根据主键删除计划工单
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteById", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public PlanTasksDto deleteById(int id) {
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        if (id > 0) {
            rtnDto = planTasksServiceI.deletePlantaskByPrimaryKey(id);
        } else {
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
        }
        return rtnDto;
    }



    /**
     * 工单分配
     * @param taskInfo
     * @param httpSession
     * @return
     */
    @RequestMapping(value = "/taskDispatch",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PlanTasksDto taskDispatch(PlanTasksDto taskInfo,HttpSession httpSession){


        PlanTasksDto rtnDto = new PlanTasksDto();

        try{
            if(taskInfo != null && StringUtils.isNotEmpty(taskInfo.getTaskOwner())){
                UserDto user = this.getUserDetail(httpSession);
                String fromUser = user.getUserName();
                String toUser = taskInfo.getTaskOwner();
                //更新工单信息表，设置当前工单责任人
                rtnDto = this.planTasksServiceI.updatePlanTaskInfo(taskInfo);
                if(EDPCodeConstants.SUCCESS_CODE.equals(rtnDto.getReturnCode())){
                    //增加工单轨迹记录
                    TaskTraceDto taskTraceDto = new TaskTraceDto();
                    taskTraceDto.setTaskId(taskInfo.getTaskId());
                    taskTraceDto.setFromUser(fromUser);
                    taskTraceDto.setToUser(toUser);
                    taskTraceDto.setOperateTime(DateUtil.time2String(new Date()));
                    taskTraceDto.setTaskState(EDPCodeConstants.TASK_STATE_TRANSFERED);//转移
                    taskTraceDto.setOperateSpec("工单分配");
//                    taskTraceDto.setOperateType(EDPCodeConstants.OPERATE_TYPE_TRANSFERED);
                    this.taskTraceServiceI.saveTaskTrace(taskTraceDto);
                }


            }else{
                rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            }
        }catch (Exception e){
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }



        return rtnDto;
    }
}
