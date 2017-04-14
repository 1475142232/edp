package com.edp.admin.planInfo;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.edp.admin.common.BaseController;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.DateUtil;
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.PlanInfoDto;
import com.edp.serviceI.dto.UserDto;
import com.edp.serviceI.planInfo.PlanInfoServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 计划信息业务控制类
 * Created by changer on 16/8/5.
 */

@Controller
@RequestMapping("/planInfo")
public class PlanInfoController extends BaseController {


    @Resource
    private PlanInfoServiceI planInfoServiceI;


    /**
     *条件查询计划信息
     * @param planInfo
     * @return
     */
    @RequestMapping(value = "/queryAllPlanInfos",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PlanInfoDto queryAllPlanInfos(PlanInfoDto planInfo){
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        //调用查询服务
        rtnDto = planInfoServiceI.queryAllPlanInfosByCondition(planInfo);

        return rtnDto;
    }


    /**
     * 保存计划信息
     * @param planInfo
     * @return
     */
    @RequestMapping(value = "/save",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PlanInfoDto save(PlanInfoDto planInfo,HttpSession httpSession){
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();
        //获取当前登录人及当前时间
        UserDto userDetail = this.getUserDetail(httpSession);
        String currUser = userDetail.getUserName();
        planInfo.setCreateUser(currUser);
        planInfo.setCreateTime(DateUtil.time2String(new Date()));
        //生成计划编号
        String plan_id = SequenceManage.getSequence("P");

        planInfo.setPlanId(plan_id);
        //调用保存服务
        rtnDto = planInfoServiceI.savePlanInfo(planInfo);

        rtnDto.setPlanId(plan_id);

        return rtnDto;
    }

    /**
     * 更新计划信息
     * @param planInfo
     * @return
     */
    @RequestMapping(value = "/update",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PlanInfoDto update(PlanInfoDto planInfo,HttpSession httpSession){
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();
        //调用保存服务
        rtnDto = planInfoServiceI.updatePlanInfo(planInfo);


        return rtnDto;
    }


    /**
     * 根据主键查询计划信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PlanInfoDto findById(int id){
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        if(id>0){
            //调用保存服务
            rtnDto = planInfoServiceI.findPlanInfoByPrimaryKey(id);
        }else{
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG+",id="+id);
        }

        return rtnDto;
    }

    /**
     * 根据主键删除计划信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteById",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PlanInfoDto deleteById(int id){
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        if(id>0){
            //调用删除服务
           rtnDto =  planInfoServiceI.deletePlanInfoByPrimaryKey(id);
        }else{
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG+",id="+id);
        }

        return rtnDto;
    }


    /**
     * 根据产品编号删除计划信息
     * @param productId
     * @return
     */
    @RequestMapping(value = "/deleteByProductId",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public PlanInfoDto deleteByProductId(String productId){
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        if(StringUtils.isNotEmpty(productId)){
            //调用删除服务
           rtnDto =  planInfoServiceI.deletePlanInfosByProductId(productId);
        }else{
            rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG+",productId="+productId);
        }

        return rtnDto;
    }


}
