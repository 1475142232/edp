package com.edp.service.PlanTasks;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.PlanTasksPO;
import com.edp.dao.domain.PlanTasksPOCriteria;
import com.edp.dao.mapper.PlanTasksPOMapper;
import com.edp.serviceI.dto.PlanTasksDto;
import com.edp.serviceI.planTasks.PlanTasksServiceI;
import com.google.common.base.Splitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 计划工单服务接口类
 * Created by changer on 16/8/5.
 */
@Service("planTasksServiceI")
public class PlanTasksServiceImpl implements PlanTasksServiceI {


    private static final Logger log = LoggerFactory.getLogger(PlanTasksServiceImpl.class);

    @Resource
    private PlanTasksPOMapper planTasksPOMapper;


    /**
     * 条件查询方法
     *
     * @param condition
     * @return
     */
    @Override
    public PlanTasksDto queryAllPlanTasksByCondition(PlanTasksDto condition) {

        log.info("条件查询开始");
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();
        //创建查询对象
        PlanTasksPOCriteria queryObj = new PlanTasksPOCriteria();
        PlanTasksPOCriteria.Criteria criteria = queryObj.createCriteria();

        try {

            if (condition != null) {
                log.info("输入参数=" + JSON.toJSONString(condition));
                List<PlanTasksDto> planTasksDtos = new ArrayList<>();
                this.composeCondition(queryObj, criteria, condition);

                //获取符合条件的总记录数
                int count = planTasksPOMapper.countByExample(queryObj);

                log.info("查询记录数=" + count);
                if (count > 0) {

                    List<PlanTasksPO> planTasksPOs = planTasksPOMapper.selectByExampleWithBLOBs(queryObj);

                    planTasksDtos = BeanCopyUtils.populateTListbyDListBySpring(planTasksPOs, PlanTasksDto.class);

                }

                rtnDto.setResults(count);
                rtnDto.setRows(planTasksDtos);

                rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);

                log.info(EDPCodeConstants.SUCCESS_MSG);

            }

        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
            log.info(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
        }
        log.info("条件查询结束");
        return rtnDto;
    }


    /**
     * 根据主键查询工单信息
     *
     * @param id
     * @return
     */
    @Override
    public PlanTasksDto findTaskInfoByprimaryKey(int id) {
        log.info("根据主键查询工单信息开始");
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        try {

            //调用查询方法
            log.info("调用查询方法 ：selectByPrimaryKey");
            PlanTasksPO planTasksPO = planTasksPOMapper.selectByPrimaryKey(id);
            if (planTasksPO != null) {
                rtnDto = BeanCopyUtils.populateTbyDBySpring(planTasksPO, PlanTasksDto.class);
            }

            rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);

            log.info(EDPCodeConstants.SUCCESS_MSG);
        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
            log.info(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
        }

        log.info("根据主键查询工单结束");
        return rtnDto;
    }


    /**
     * 保存计划工单
     *
     * @param planTasks
     * @return
     */
    @Override
    public PlanTasksDto savePlanTaskInfo(PlanTasksDto planTasks) {
        log.info("保存计划工单信息开始");
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        try {

            if (planTasks != null) {

                PlanTasksPO planTasksPO = BeanCopyUtils.populateTbyDBySpring(planTasks, PlanTasksPO.class);
                //调用保存方法
                log.info("调用保存方法:insert");
                int result = planTasksPOMapper.insert(planTasksPO);
                if (result > 0) {

                    rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                    log.info(EDPCodeConstants.SUCCESS_MSG);
                } else {
                    rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
                    log.info(EDPCodeConstants.ERROR_MSG);
                }
            } else {
                rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
                log.info(EDPCodeConstants.INVALID_DATA_MSG);
            }


        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
            log.info(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
        }


        log.info("保存计划工单信息结束");
        return rtnDto;
    }


    /**
     * 批量保存计划工单
     *
     * @param planTasks
     * @return
     */
    @Override
    public PlanTasksDto savePlanTaskInfosByPatch(List<PlanTasksDto> planTasks) {
        log.info("批量保存开始");
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        try {
            if (planTasks != null && planTasks.size() > 0) {
                List<PlanTasksPO> planTasksPOs = BeanCopyUtils.populateTListbyDListBySpring(planTasks, PlanTasksPO.class);


                int result = planTasksPOMapper.patchInsert(planTasksPOs);
                log.info("保存记录数=" + result + ",输入的记录数=" + planTasksPOs.size());
                if (result == planTasksPOs.size()) {
                    rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                    log.info(EDPCodeConstants.SUCCESS_MSG);
                } else {
                    rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
                    log.info(EDPCodeConstants.ERROR_MSG);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
            log.info(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
        }

        log.info("批量保存结束");
        return rtnDto;
    }


    /**
     * 更新计划工单信息
     *
     * @param planTasks
     * @return
     */
    @Override
    public PlanTasksDto updatePlanTaskInfo(PlanTasksDto planTasks) {
        log.info("更新计划工单信息开始");
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        try {

            if (planTasks != null) {

                PlanTasksPO planTasksPO = BeanCopyUtils.populateTbyDBySpring(planTasks, PlanTasksPO.class);
                //创建查询对象
                PlanTasksPOCriteria queryObj = new PlanTasksPOCriteria();
                PlanTasksPOCriteria.Criteria criteria = queryObj.createCriteria();

                if(planTasks.getId() != null){
                    criteria.andIdEqualTo(planTasks.getId());
                }

                if(StringUtils.isNotEmpty(planTasks.getTaskId())){
                    criteria.andTaskIdEqualTo(planTasks.getTaskId());
                }
                //调用保存方法
                log.info("调用更新方法:insert");
                int result = planTasksPOMapper.updateByExampleSelective(planTasksPO,queryObj);
                if (result > 0) {

                    rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                    log.info(EDPCodeConstants.SUCCESS_MSG);
                } else {
                    rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
                    log.info(EDPCodeConstants.ERROR_MSG);
                }
            } else {
                rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
                log.info(EDPCodeConstants.INVALID_DATA_MSG);
            }


        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
            log.info(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
        }


        log.info("更新计划工单信息结束");
        return rtnDto;
    }


    /**
     * 根据主键删除计划工单
     *
     * @param id
     * @return
     */
    @Override
    public PlanTasksDto deletePlantaskByPrimaryKey(int id) {

        log.info("根据主键删除计划工单开始");
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        try {

            //调用删除方法
            log.info("调用删除方法:deleteByPrimaryKey");
            int result = planTasksPOMapper.deleteByPrimaryKey(id);
            rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            log.info(EDPCodeConstants.SUCCESS_MSG);


        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
            log.info(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
        }

        log.info("根据主键删除计划工单结束");
        return rtnDto;
    }


    /**
     * 根据主键批量删除计划工单
     *
     * @param ids
     * @return
     */
    @Override
    public PlanTasksDto deletePlantaskByPatch(String ids) {

        log.info("批量删除计划工单开始");
        //创建返回对象
        PlanTasksDto rtnDto = new PlanTasksDto();

        //创建查询对象
        PlanTasksPOCriteria queryObj = new PlanTasksPOCriteria();
        PlanTasksPOCriteria.Criteria criteria = queryObj.createCriteria();
        try {

            log.info("输入的参数,ids=" + ids);

            if (StringUtils.isNotEmpty(ids)) {
                List<Integer> idList = new ArrayList<>();
                Iterator<String> idC = (Iterator<String>) Splitter.on(",").omitEmptyStrings().split(ids);
                while (idC.hasNext()) {
                    String id = idC.next();
                    idList.add(Integer.valueOf(id));
                }

                criteria.andIdIn(idList);

                //调用删除方法
                log.info("调用删除方法：deleteByExample");
                int result = planTasksPOMapper.deleteByExample(queryObj);

                rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                log.info(EDPCodeConstants.SUCCESS_MSG);

            } else {
                rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
                log.info(EDPCodeConstants.INVALID_DATA_MSG);
            }


        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
            log.info(EDPCodeConstants.ERROR_MSG + "," + e.getMessage());
        }


        log.info("批量删除计划工单结束");
        return rtnDto;
    }


    /**
     * 条件组装方法
     *
     * @param example
     * @param criteria
     * @param condition
     */
    private void composeCondition(PlanTasksPOCriteria example, PlanTasksPOCriteria.Criteria criteria, PlanTasksDto condition) {

        log.info("工单查询条件组装--start");

        log.info("参数===>" + JSON.toJSONString(condition));
        if (condition != null) {

            //拼装分页信息
            String pageStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, condition.getPageIndex(), condition.getLimit());
            example.setOrderByClause(pageStr);


            //拼装查询条件
            if (condition.getId() != null) {//主键
                criteria.andIdEqualTo(condition.getId());
            }
            if (StringUtils.isNotEmpty(condition.getProductId())) {//产品编号
                criteria.andProductIdEqualTo(condition.getProductId());
            }

            if (StringUtils.isNotEmpty(condition.getProductName())) {//产品名称
                criteria.andProductNameLike("%" + condition.getProductName() + "%");
            }

            if (StringUtils.isNotEmpty(condition.getTaskId())) {//工单编号
                criteria.andTaskIdEqualTo(condition.getTaskId());
            }

            if (StringUtils.isNotEmpty(condition.getTaskName())) {//工单名称
                criteria.andTaskNameLike("%" + condition.getTaskName() + "%");
            }

            if (StringUtils.isNotEmpty(condition.getTaskOwner())) {//工单负责人
                criteria.andTaskOwnerEqualTo(condition.getTaskOwner());
            }

            if (StringUtils.isNotEmpty(condition.getTaskReceiveTime())) {//工单接收时间
                criteria.andTaskReceiveTimeEqualTo(condition.getTaskReceiveTime());
            }

            if (StringUtils.isNotEmpty(condition.getTaskState())) {//工单状态
                criteria.andTaskStateEqualTo(condition.getTaskState());
            }

            if (StringUtils.isNotEmpty(condition.getTaskType())) {//工单类型
                criteria.andTaskTypeEqualTo(condition.getTaskType());
            }

            if (condition.getTaskVersion() != null && condition.getTaskVersion().byteValue() > 0) {//工单版本
                criteria.andTaskVersionLessThanOrEqualTo(condition.getTaskVersion());
            }

            if (StringUtils.isNotEmpty(condition.getTaskStartTime())) {//工单开始时间
                criteria.andTaskStartTimeEqualTo(condition.getTaskStartTime());
            }

            if (StringUtils.isNotEmpty(condition.getPlanId())) {//计划编号
                criteria.andPlanIdEqualTo(condition.getPlanId());
            }
        }
        log.info("工单查询条件组装--end");


    }
}
