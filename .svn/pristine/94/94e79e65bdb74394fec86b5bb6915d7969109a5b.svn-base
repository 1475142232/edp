package com.edp.service.PlanInfo;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.PlanInfoPO;
import com.edp.dao.domain.PlanInfoPOCriteria;
import com.edp.dao.mapper.PlanInfoPOMapper;
import com.edp.serviceI.dto.PlanInfoDto;
import com.edp.serviceI.planInfo.PlanInfoServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 计划信息服务实现类
 * Created by changer on 16/8/4.
 */

@Service("planInfoServiceI")
public class PlanInfoServiceImpl implements PlanInfoServiceI {


    private static final Logger log = LoggerFactory.getLogger(PlanInfoServiceImpl.class);

    @Resource
    private PlanInfoPOMapper planInfoPOMapper;


    /**
     * 条件查询
     *
     * @param condition
     * @return
     */
    @Override
    public PlanInfoDto queryAllPlanInfosByCondition(PlanInfoDto condition) {

        log.info("条件查询开始");
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();


        try {
            //创建查询对象
            PlanInfoPOCriteria queryObj = new PlanInfoPOCriteria();
            PlanInfoPOCriteria.Criteria criteria = queryObj.createCriteria();


            //调用条件组装方法
            this.composeConditions(queryObj, criteria, condition);


            //查询符合条件的记录总数

            int count = planInfoPOMapper.countByExample(queryObj);
            List<PlanInfoDto> planInfoDtos = new ArrayList<>();

            log.info("条件记录查询结果记录数=" + count);
            if (count > 0) {

                List<PlanInfoPO> planInfoPOs = planInfoPOMapper.selectByExample(queryObj);

                planInfoDtos = BeanCopyUtils.populateTListbyDListBySpring(planInfoPOs, PlanInfoDto.class);
            }


            //返回查询结果
            rtnDto.setResults(count);
            rtnDto.setRows(planInfoDtos);


            rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);

            log.info(EDPCodeConstants.SUCCESS_MSG);
        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            log.info(EDPCodeConstants.ERROR_MSG);
        }


        log.info("条件查询结束");
        return rtnDto;
    }

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    @Override
    public PlanInfoDto findPlanInfoByPrimaryKey(int id) {

        log.info("根据主键查询开始");

        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        try {

            //主键查询方法
            PlanInfoPO planInfoPO = planInfoPOMapper.selectByPrimaryKey(id);
            if (planInfoPO != null) {
                rtnDto = BeanCopyUtils.populateTbyDBySpring(planInfoPO, PlanInfoDto.class);
            }

            //返回查询结果信息
            rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            log.info(EDPCodeConstants.SUCCESS_MSG);
        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            log.info(EDPCodeConstants.ERROR_MSG);
        }

        log.info("根据主键查询退出");
        return rtnDto;
    }


    /**
     * 保存计划信息
     *
     * @param planInfo
     * @return
     */
    @Override
    public PlanInfoDto savePlanInfo(PlanInfoDto planInfo) {

        log.info("保存计划信息开始");
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        try {
            if (planInfo != null) {

                log.info("输入的参数=" + JSON.toJSONString(planInfo));
                //参数转换
                PlanInfoPO planInfoPO = BeanCopyUtils.populateTbyDBySpring(planInfo, PlanInfoPO.class);
                //调用保存方法
                log.info("调用保存计划方法");
                int result = planInfoPOMapper.insert(planInfoPO);

                if (result > 0) {
                    rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                    log.info(EDPCodeConstants.SUCCESS_MSG);
                } else {
                    rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
                    rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
                    log.info(EDPCodeConstants.ERROR_MSG);
                }

            } else {//不存在保存对象
                rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
                log.info(EDPCodeConstants.INVALID_DATA_MSG);
            }
        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            log.info(EDPCodeConstants.ERROR_MSG);
        }

        log.info("保存计划信息结束");
        return rtnDto;
    }

    /**
     * 更新计划信息
     *
     * @param planInfo
     * @return
     */
    @Override
    public PlanInfoDto updatePlanInfo(PlanInfoDto planInfo) {


        log.info("更新计划信息开始");
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        try {
            if (planInfo != null && planInfo.getId()!=null&& planInfo.getId()>0) {

                log.info("输入的参数=" + JSON.toJSONString(planInfo));
                //参数转换
                PlanInfoPO planInfoPO = BeanCopyUtils.populateTbyDBySpring(planInfo, PlanInfoPO.class);
                //调用保存方法
                log.info("调用计划更新方法");
                int result = planInfoPOMapper.updateByPrimaryKeySelective(planInfoPO);

                if (result > 0) {
                    rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                    rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                    log.info(EDPCodeConstants.SUCCESS_MSG);
                } else {
                    rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
                    rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
                    log.info(EDPCodeConstants.ERROR_MSG);
                }

            } else {//不存在保存对象
                rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
                log.info(EDPCodeConstants.INVALID_DATA_MSG);
            }
        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            log.info(EDPCodeConstants.ERROR_MSG);
        }

        log.info("更新计划信息结束");
        return rtnDto;
    }

    /**
     * 根据主键删除计划信息
     *
     * @param id
     * @return
     */
    @Override
    public PlanInfoDto deletePlanInfoByPrimaryKey(int id) {
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        log.info("根据主键删除计划信息开始");
        try {

            //调用删除方法
            log.info("调用计划删除方法");
            int result = planInfoPOMapper.deleteByPrimaryKey(id);

            rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            log.info(EDPCodeConstants.SUCCESS_MSG);

        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            log.info(EDPCodeConstants.ERROR_MSG);
        }

        log.info("根据主键删除计划信息结束");
        return rtnDto;
    }


    /**
     * 根据产品编号删除计划信息
     *
     * @param productId
     * @return
     */
    @Override
    public PlanInfoDto deletePlanInfosByProductId(String productId) {

        log.info("根据产品编号删除计划开始");
        //创建返回对象
        PlanInfoDto rtnDto = new PlanInfoDto();

        try {
            if (StringUtils.isNotEmpty(productId)) {

                //创建查询对象
                PlanInfoPOCriteria deleteCondition = new PlanInfoPOCriteria();

                PlanInfoPOCriteria.Criteria criteria = deleteCondition.createCriteria();

                criteria.andProductIdEqualTo(productId);

                //调用删除方法
                log.info("调用删除方法");

                int result = planInfoPOMapper.deleteByExample(deleteCondition);


                rtnDto.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                log.info(EDPCodeConstants.SUCCESS_MSG);


            } else {//输入参数无效
                rtnDto.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtnDto.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
                log.info(EDPCodeConstants.INVALID_DATA_MSG);
            }
        } catch (Exception e) {
            e.printStackTrace();
            rtnDto.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            rtnDto.setReturnCode(EDPCodeConstants.ERROR_CODE);
            log.info(EDPCodeConstants.ERROR_MSG);
        }


        log.info("根据产品编号删除计划结束");
        return rtnDto;
    }


    /**
     * 组装查询条件
     *
     * @param example
     * @param criteria
     * @param condition
     */
    private void composeConditions(PlanInfoPOCriteria example, PlanInfoPOCriteria.Criteria criteria, PlanInfoDto condition) {

        log.info("组装查询条件开始");

        log.info("查询参数=" + JSON.toJSONString(condition));

        if (condition != null) {

            //拼装分页信息
            String pageStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, condition.getPageIndex(), condition.getLimit());
            example.setOrderByClause(pageStr);

            //组装条件

            if(condition.getId()!= null){//主键
                criteria.andIdEqualTo(condition.getId());
            }
            if (StringUtils.isNotEmpty(condition.getCreateTime())) {//创建时间
                criteria.andCreateTimeEqualTo(condition.getCreateTime());
            }

            if (StringUtils.isNotEmpty(condition.getCreateUser())) {//创建人
                criteria.andCreateUserEqualTo(condition.getCreateUser());
            }

            if (StringUtils.isNotEmpty(condition.getEndTime())) {//计划结束时间
                criteria.andEndTimeEqualTo(condition.getEndTime());
            }

            if (StringUtils.isNotEmpty(condition.getPlanName())) {//计划名称-模糊查询
                criteria.andPlanNameLike("%" + condition.getPlanName() + "%");
            }

            if (StringUtils.isNotEmpty(condition.getPlanState())) {//计划状态
                criteria.andPlanStateEqualTo(condition.getPlanState());
            }

            if (StringUtils.isNotEmpty(condition.getProductId())) {//产品编号
                criteria.andProductIdEqualTo(condition.getProductId());
            }

            if (StringUtils.isNotEmpty(condition.getProductName())) {//产品名称-模糊查询
                criteria.andProductNameLike("%" + condition.getProductName() + "%");
            }

            if (StringUtils.isNotEmpty(condition.getStartTime())) {//计划开始时间
                criteria.andStartTimeEqualTo(condition.getStartTime());
            }

            if (condition.getWorkloadBase()!= null && condition.getWorkloadBase() > 0) {//基准工作量-低于OR等于
                criteria.andWorkloadBaseLessThanOrEqualTo(condition.getWorkloadBase());
            }

            if (condition.getWorkloadDone()!= null && condition.getWorkloadDone() > 0) {//计划工作量-低于OR等于
                criteria.andWorkloadDoneLessThanOrEqualTo(condition.getWorkloadDone());
            }

            if (condition.getWorkloadPlan()!= null && condition.getWorkloadPlan() > 0) {//实际工作量-低于OR等于
                criteria.andWorkloadPlanLessThanOrEqualTo(condition.getWorkloadPlan());
            }


        }

        log.info("条件组装完成");

    }
}
