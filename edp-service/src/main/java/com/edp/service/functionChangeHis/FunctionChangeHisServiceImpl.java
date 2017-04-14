package com.edp.service.functionChangeHis;

import com.alibaba.fastjson.JSON;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.FunctionChangeHisPo;
import com.edp.dao.domain.FunctionChangeHisPoCriteria;
import com.edp.dao.mapper.FunctionChangeHisPoMapper;
import com.edp.serviceI.dto.FunctionChangeHisDto;
import com.edp.serviceI.functionChangeHis.FunctionChangeHisServiceI;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能变更历史操作服务
 * Created by changer on 2016/5/25.
 */
@Service("functionChangeHisServiceI")
public class FunctionChangeHisServiceImpl implements FunctionChangeHisServiceI {


    @Resource
    private FunctionChangeHisPoMapper functionChangeHisPoMapper;


    private final Logger log = LoggerFactory.getLogger(FunctionChangeHisServiceImpl.class);


    /**
     * 查询所有的功能变更历史信息
     *
     * @param condition 查询条件带分页
     * @return
     * @author changer 2016-5-25
     */
    @Override
    public FunctionChangeHisDto queryFunctionChangeHisList(FunctionChangeHisDto condition) {

        log.info("queryFunctionChangeHisListByCondition==>start");
        log.info("queryFunctionChangeHisListByCondition==>传入的查询条件=" + JSON.toJSONString(condition));

        //创建查询对象
        FunctionChangeHisPoCriteria example = new FunctionChangeHisPoCriteria();
        FunctionChangeHisPoCriteria.Criteria criteria = example.createCriteria();

        //创建返回对象
        FunctionChangeHisDto rtn = new FunctionChangeHisDto();

        try {
            if (condition != null) {
                //添加查询条件
                if (StringUtils.isNotEmpty(condition.getFuncId())) {
                    criteria.andFuncIdEqualTo(condition.getFuncId());
                }

                if (StringUtils.isNotEmpty(condition.getFuncName())) {
                    criteria.andFuncNameLike("%" + condition.getFuncName() + "%");
                }

                if (condition.getId() != null) {
                    criteria.andIdEqualTo(condition.getId());
                }

                if (condition.getVersion() != null) {
                    criteria.andVersionEqualTo(condition.getVersion());
                }

                //查询记录总条数

                int total = functionChangeHisPoMapper.countByExample(example);
                log.info("queryFunctionChangeHisListByCondition==>查询记录数=" + total);
                if (total > 0) {//存在记录
                    //分页

                    String pageStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, condition.getPageIndex(), condition.getLimit());
                    example.setOrderByClause(pageStr);

                    //查询记录集合

                    List<FunctionChangeHisPo> functionChangeHisPos = functionChangeHisPoMapper.selectByExample(example);

                    List<FunctionChangeHisDto> functionChangeHisDtos = BeanCopyUtils.populateTListbyDListBySpring(functionChangeHisPos, FunctionChangeHisDto.class);

                    rtn.setRows(functionChangeHisDtos);
                    rtn.setResults(total);
                } else {
                    rtn.setRows(null);
                    rtn.setResults(0);
                }

                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);

            }

        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            e.printStackTrace();
        }

        log.info("queryFunctionChangeHisListByCondition==>end");
        return rtn;
    }

    /**
     * 根据历史编号查询变更历史记录
     *
     * @param id 功能变更历史编号
     * @return
     * @author change 2016-5-25
     */
    @Override
    public FunctionChangeHisDto findFunctionChangeHisById(int id) {
        log.info("findFunctionChangeHisById==>start");
        log.info("findFunctionChangeHisById==>查询的ID=" + id);

        //创建返回对象
        FunctionChangeHisDto rtn = new FunctionChangeHisDto();

        try {

            FunctionChangeHisPo functionChangeHisPo = functionChangeHisPoMapper.selectByPrimaryKey(id);

            if (functionChangeHisPo != null) {
                rtn = BeanCopyUtils.populateTbyDBySpring(functionChangeHisPo, rtn);
            }

            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            log.info("findFunctionChangeHisById==>查询完成");
        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            e.printStackTrace();
        }

        log.info("findFunctionChangeHisById==>end");
        return rtn;
    }


    /**
     * 根据功能编号查询相关的变更历史信息集合
     *
     * @param funcId 功能编号
     * @return
     * @author changer 2016-5-25
     */
    @Override
    public FunctionChangeHisDto findFunctionChangeHisListByFuncId(String funcId) {
        log.info("findFunctionChangeHisListByFuncId==>start");
        log.info("findFunctionChangeHisListByFuncId==>传入的功能编号=" + funcId);


        //创建返回对象
        FunctionChangeHisDto rtn = new FunctionChangeHisDto();

        try {
            if (StringUtils.isEmpty(funcId)) {
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {
                //创建参数对象
                FunctionChangeHisDto params = new FunctionChangeHisDto();


                params.setFuncId(funcId);
                log.info("findFunctionChangeHisListByFuncId==>调用queryFunctionChangeHisList方法");
                rtn = this.queryFunctionChangeHisList(params);

            }
        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            e.printStackTrace();
        }


        log.info("findFunctionChangeHisListByFuncId==>end");

        return rtn;
    }

    /**
     * 保存变更历史信息
     *
     * @param saveDto
     * @return
     * @author 2016-5-25
     */
    @Override
    public FunctionChangeHisDto saveFunctionChangeHis(FunctionChangeHisDto saveDto) {

        log.info("saveFunctionChangeHis==>start");
        log.info("saveFunctionChangeHis==>要保存的对象数据=" + JSON.toJSONString(saveDto));

        //创建返回对象
        FunctionChangeHisDto rtn = new FunctionChangeHisDto();

        try {
            if (saveDto == null) {

                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {

                FunctionChangeHisPo savePo = BeanCopyUtils.populateTbyDBySpring(saveDto, FunctionChangeHisPo.class);
                functionChangeHisPoMapper.insert(savePo);

                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                log.info("saveFunctionChangeHis==>保存成功");
            }
        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            e.printStackTrace();
        }

        log.info("saveFunctionChangeHis==>end");
        return rtn;
    }

    /**
     * 更新变更历史信息
     *
     * @param updateDto
     * @return
     * @author 2016-5-25
     */
    @Override
    public FunctionChangeHisDto updateFunctionChangeHis(FunctionChangeHisDto updateDto) {
        log.info("updateFunctionChangeHis==>start");
        log.info("updateFunctionChangeHis==>要更新的对象数据=" + JSON.toJSONString(updateDto));

        //创建返回对象
        FunctionChangeHisDto rtn = new FunctionChangeHisDto();

        try {
            if (updateDto == null) {

                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {

                FunctionChangeHisPo savePo = BeanCopyUtils.populateTbyDBySpring(updateDto, FunctionChangeHisPo.class);
                functionChangeHisPoMapper.updateByPrimaryKey(savePo);

                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
                log.info("updateFunctionChangeHis==>更新成功");
            }
        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            e.printStackTrace();
        }

        log.info("updateFunctionChangeHis==>end");
        return rtn;
    }

    /**
     * 根据编号删除变更历史记录
     *
     * @param id
     * @return
     * @author 2016-5-25
     */
    @Override
    public FunctionChangeHisDto deleteFunctionChangeHisById(int id) {
        log.info("deleteFunctionChangeHisById==>start");
        log.info("deleteFunctionChangeHisById==>id=" + id);
        //创建返回对象
        FunctionChangeHisDto rtn = new FunctionChangeHisDto();


        try {

            functionChangeHisPoMapper.deleteByPrimaryKey(id);
            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            log.info("deleteFunctionChangeHisById==>删除完成");
        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("deleteFunctionChangeHisById==>end");
        return rtn;
    }

    @Override
    public FunctionChangeHisDto deleteFunctionChangeHisByFuncId(String funcId) {


        log.info("deleteFunctionChangeHisByFuncId==>start");
        log.info("deleteFunctionChangeHisByFuncId==>功能编号=" + funcId);
        //创建返回对象
        FunctionChangeHisDto rtn = new FunctionChangeHisDto();


        try {


            if (StringUtils.isEmpty(funcId)) {

                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);

            } else {
                //创建条件对象
                FunctionChangeHisPoCriteria example = new FunctionChangeHisPoCriteria();
                FunctionChangeHisPoCriteria.Criteria criteria = example.createCriteria();
                criteria.andFuncIdEqualTo(funcId);
                functionChangeHisPoMapper.deleteByExample(example);
                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            }


        } catch (Exception e) {
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
            e.printStackTrace();
        }

        log.info("deleteFunctionChangeHisByFuncId==>end");
        return rtn;
    }
}
