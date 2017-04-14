package com.edp.service.reqChangeInfoService;

import com.alibaba.fastjson.JSON;
import com.edp.common.constant.Constants;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.ReqChangeInfoPo;
import com.edp.dao.domain.ReqChangeInfoPoCriteria;
import com.edp.dao.mapper.ReqChangeInfoPoMapper;
import com.edp.serviceI.dto.ReqChangeInfoDto;
import com.edp.serviceI.reqChangeInfo.ReqChangeInfoServiceI;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 需求变更信息服务
 * 用于保存需求变更中的功能变更信息
 * Created by changer on 2016/5/25.
 */
@Service("reqChangeInfoServiceI")
public class ReqChangeInfoServiceImpl implements ReqChangeInfoServiceI {

    @Resource
    private ReqChangeInfoPoMapper reqChangeInfoPoMapper;

    private final Logger log = LoggerFactory.getLogger(ReqChangeInfoServiceImpl.class);

    /**
     * 需求变更信息查询,带分页
     *
     * @param condition 列表查询条件
     * @return
     * @author changer 2016-5-25
     */
    @Override
    public ReqChangeInfoDto queryReqChangeInfoList(ReqChangeInfoDto condition) {

        log.info("queryReqChangeInfoList==>start");
        log.info("queryReqChangeInfoList==>查询的参数=" + JSON.toJSONString(condition));

        //创建查询对象
        ReqChangeInfoPoCriteria example = new ReqChangeInfoPoCriteria();
        ReqChangeInfoPoCriteria.Criteria criteria = example.createCriteria();

        //创建返回对象
        ReqChangeInfoDto rtn = new ReqChangeInfoDto();


        try {
            if (condition == null) {
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {
                if (StringUtils.isNotEmpty(condition.getFunctionId())) {
                    criteria.andFunctionIdEqualTo(condition.getFunctionId());
                }

                if (StringUtils.isNotEmpty(condition.getFunctionName())) {
                    criteria.andFunctionNameLike("%" + condition.getFunctionName() + "%");
                }

                if (condition.getId() != null) {
                    criteria.andIdEqualTo(condition.getId());
                }

                if (StringUtils.isNotEmpty(condition.getApplyor())) {
                    criteria.andApplyorEqualTo(condition.getApplyor());
                }

                if (StringUtils.isNotEmpty(condition.getVerifyor())) {
                    criteria.andVerifyorEqualTo(condition.getVerifyor());
                }
            }

            //查询记录总条数
            int total = this.reqChangeInfoPoMapper.countByExample(example);
            log.info("queryReqChangeInfoList==>记录总条数=" + total);

            //设置分页
            String pageStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, condition.getPageIndex(), condition.getLimit());
            example.setOrderByClause(pageStr);

            if (total > 0) {
                List<ReqChangeInfoPo> rtnPo = this.reqChangeInfoPoMapper.selectByExample(example);
                List<ReqChangeInfoDto> dtos = BeanCopyUtils.populateTListbyDListBySpring(rtnPo, ReqChangeInfoDto.class);
                rtn.setRows(dtos);
                rtn.setResults(total);

            } else {
                rtn.setRows(null);
                rtn.setResults(0);
            }
            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);

        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("queryReqChangeInfoList==>end");
        return rtn;
    }


    /**
     * 需求变更信息保存
     *
     * @param saveDto
     * @return
     * @author changer 2016-5-25
     */
    @Override
    public ReqChangeInfoDto saveReqChangeInfo(ReqChangeInfoDto saveDto) {

        log.info("saveReqChangeInfo==>start");
        log.info("saveReqChangeInfo==>需要保存的对象数据=" + JSON.toJSONString(saveDto));
        //创建返回对象
        ReqChangeInfoDto rtn = new ReqChangeInfoDto();

        try {
            if (saveDto == null) {
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {

                ReqChangeInfoPo savePo = BeanCopyUtils.populateTbyDBySpring(saveDto, ReqChangeInfoPo.class);
                reqChangeInfoPoMapper.insert(savePo);

                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                log.info("saveReqChangeInfo==>保存数据成功");
            }

        } catch (Exception E) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }


        log.info("saveReqChangeInfo==>end");
        return rtn;
    }

    /**
     * 更新需求变更信息
     *
     * @param updateDto
     * @return
     */
    @Override
    public ReqChangeInfoDto updateReqChangeInfo(ReqChangeInfoDto updateDto) {
        log.info("updateReqChangeInfo==>start");
        log.info("updateReqChangeInfo==>需要更新的对象数据=" + JSON.toJSONString(updateDto));
        //创建返回对象
        ReqChangeInfoDto rtn = new ReqChangeInfoDto();

        try {
            if (updateDto == null) {
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {

                ReqChangeInfoPo savePo = BeanCopyUtils.populateTbyDBySpring(updateDto, ReqChangeInfoPo.class);
                reqChangeInfoPoMapper.updateByPrimaryKey(savePo);

                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                log.info("updateReqChangeInfo==>更新数据成功");
            }

        } catch (Exception E) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }


        log.info("updateReqChangeInfo==>end");
        return rtn;
    }


    /**
     * 根据需求变更信息编号查询变更信息
     *
     * @param id 需求变更信息编号
     * @return
     */
    @Override
    public ReqChangeInfoDto findReqChangeInfoById(int id) {
        log.info("findReqChangeInfoById==>start");
        log.info("findReqChangeInfoById==>查询编号=" + id);

        //创建返回对象
        ReqChangeInfoDto rtn = new ReqChangeInfoDto();


        try {
            ReqChangeInfoPo reqChangeInfoPo = reqChangeInfoPoMapper.selectByPrimaryKey(id);

            if (reqChangeInfoPo != null) {
                rtn = BeanCopyUtils.populateTbyDBySpring(reqChangeInfoPo, rtn);
            }

            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);


        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }
        log.info("findReqChangeInfoById==>end");
        return rtn;

    }

    /**
     * 根据功能编号查询需求变更信息
     *
     * @param refId 功能编号
     * @return
     */
    @Override
    public ReqChangeInfoDto findLastestReqChangeInfoByRefId(String refId) {

        log.info("findReqChangeInfoByFuncId==>start");
        log.info("findReqChangeInfoByFuncId==>查询关联编号=" + refId);

        //创建查询对象
        ReqChangeInfoPoCriteria example = new ReqChangeInfoPoCriteria();
        ReqChangeInfoPoCriteria.Criteria criteria = example.createCriteria();

        //创建返回对象
        ReqChangeInfoDto rtn = new ReqChangeInfoDto();


        try {

            if (StringUtils.isNotEmpty(refId)) {

                criteria.andFunctionIdEqualTo(refId);
                criteria.andVarifyResultEqualTo(Constants.REQ_APPR_RESULT_UNDONE);

               List<ReqChangeInfoPo> pos =  reqChangeInfoPoMapper.selectByExample(example);

                if(pos != null&&pos.size()>0){
                    rtn = BeanCopyUtils.populateTbyDBySpring(pos.get(0),rtn);
                }

                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            } else {
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            }
        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("findReqChangeInfoByFuncId==>end");
        return rtn;
    }


    /**
     * 根据需求变更信息编号删除变更信息
     *
     * @param id 变更信息编号
     * @return
     */
    @Override
    public ReqChangeInfoDto deleteReqChangeInfoById(int id) {
        log.info("deleteReqChangeInfoById==>start");
        log.info("deleteReqChangeInfoById==>删除的信息编号=" + id);

        //创建返回对象
        ReqChangeInfoDto rtn = new ReqChangeInfoDto();

        try {

            reqChangeInfoPoMapper.deleteByPrimaryKey(id);
            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);


        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }


        log.info("deleteReqChangeInfoById==>end");
        return rtn;
    }

    /**
     * 根据功能编号删除需求变更信息
     *
     * @param funcId 功能编号
     * @return
     */
    @Override
    public ReqChangeInfoDto deleteReqChangeInfoByFuncId(String funcId) {

        log.info("deleteReqChangeInfoByFuncId==>start");
        log.info("deleteReqChangeInfoByFuncId==>删除的功能编号=" + funcId);

        //创建查询对象
        ReqChangeInfoPoCriteria example = new ReqChangeInfoPoCriteria();
        ReqChangeInfoPoCriteria.Criteria criteria = example.createCriteria();

        //创建返回对象
        ReqChangeInfoDto rtn = new ReqChangeInfoDto();

        try {
            if (StringUtils.isEmpty(funcId)) {
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {

                criteria.andFunctionIdEqualTo(funcId);

                reqChangeInfoPoMapper.deleteByExample(example);
                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            }
        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("deleteReqChangeInfoByFuncId==>end");
        return rtn;
    }
}
