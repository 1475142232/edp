package com.edp.service.BytearrayInfo;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.BytearrayInfoPo;
import com.edp.dao.domain.BytearrayInfoPoCriteria;
import com.edp.dao.mapper.BytearrayInfoPoMapper;
import com.edp.serviceI.bytearrayInfo.ByteArrayInfoServiceI;
import com.edp.serviceI.dto.BytearrayInfoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件流操作服务类
 * Created by PCZ0076 on 2016/5/20.
 */
@Service("bytearrayInfoServiceI")
public class BytearrayInfoServiceImpl implements ByteArrayInfoServiceI {

    private final Logger log = LoggerFactory.getLogger(BytearrayInfoServiceImpl.class);

    @Resource
    private BytearrayInfoPoMapper bytearrayInfoPoMapper;


    /**
     * 获取所有的文件信息
     *
     * @return
     */
    @Override
    public BytearrayInfoDto getAllFiles(BytearrayInfoDto bytearrayInfoDto) throws Exception {
        log.info("getAllFiles==> start,params="+ JSON.toJSONString(bytearrayInfoDto));
        //创建条件查询对象
        BytearrayInfoPoCriteria example = new BytearrayInfoPoCriteria();
        BytearrayInfoPoCriteria.Criteria criteria = example.createCriteria();
        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();

        //组装查询条件
        this.composeCondition(example,criteria,bytearrayInfoDto);

        try {
            //获取文件总数量
            int count = bytearrayInfoPoMapper.countByExample(example);

            log.info(" getAllFiles==>  total records =="+count);

            //设置分页信息
            String pageStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, bytearrayInfoDto.getPageIndex(), bytearrayInfoDto.getLimit());

            example.setOrderByClause(pageStr);

            //查询分页文件集合
            List<BytearrayInfoPo> bytearrayInfoPos = bytearrayInfoPoMapper.selectByExample(example);


            //拷贝
            List<BytearrayInfoDto> bytearrayInfoDtos = BeanCopyUtils.populateTListbyDListBySpring(bytearrayInfoPos, BytearrayInfoDto.class);


            //组装返回数据
            rtn.setRows(bytearrayInfoDtos);
            rtn.setResults(count);
            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("getAllFiles==> end");
        return rtn;
    }

    /**
     * 根据文件编号获取文件信息
     *
     * @param id 文件编号
     * @return
     */
    @Override
    public BytearrayInfoDto getFileById(int id) throws Exception {
        log.info("getFileById==>start");
        BytearrayInfoPoCriteria example = new BytearrayInfoPoCriteria();
        BytearrayInfoPoCriteria.Criteria criteria = example.createCriteria();
        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();


        try {
            log.info("getFileById==>id="+id);
            criteria.andIdEqualTo(id);//设置查询条件

            //查询
            BytearrayInfoPo bytearrayInfoPo = bytearrayInfoPoMapper.selectByPrimaryKey(id);

            if(bytearrayInfoPo == null){//不存在记录
                log.info("getFileById==id="+id+",查无记录!");
                //组装返回数据
                rtn.setReturnCode(EDPCodeConstants.NO_RECORD_CODE);
                rtn.setReturnInfo(EDPCodeConstants.NO_RECORD_MSG);
            }else{
                //拷贝
                rtn = BeanCopyUtils.populateTbyDBySpring(bytearrayInfoPo, rtn);
            }


            //组装返回数据
            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("getFileById==>end");
        return rtn;
    }

    /**
     * 根据文件所属对象编号查询文件信息列表
     *
     * @param bytearrayInfoDto 文件对象
     * @return
     */
    @Override
    public BytearrayInfoDto getFilesByTargetId(BytearrayInfoDto bytearrayInfoDto) throws Exception {

        String targetId = bytearrayInfoDto.getFileTargetid();
        log.info("getFilesByTargetId==>targetId="+bytearrayInfoDto.getFileTargetid());
        BytearrayInfoPoCriteria example = new BytearrayInfoPoCriteria();
        BytearrayInfoPoCriteria.Criteria criteria = example.createCriteria();
        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();


        try {


            if(StringUtils.isEmpty(targetId)){
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            }else{
                criteria.andFileTargetidEqualTo(targetId);//设置查询条件 -文件所属对象编号

                //查询总记录条数
                int count = bytearrayInfoPoMapper.countByExample(example);
                log.info("getFilesByTargetId==>total count="+count);

                //设置分页信息
                String pageStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, bytearrayInfoDto.getPageIndex(), bytearrayInfoDto.getLimit());

                example.setOrderByClause(pageStr);
                //获取记录集合
                List<BytearrayInfoPo> bytearrayInfoPos = bytearrayInfoPoMapper.selectByExampleWithBLOBs(example);

                //拷贝
                List<BytearrayInfoDto> bytearrayInfoDtos = BeanCopyUtils.populateTListbyDListBySpring(bytearrayInfoPos, BytearrayInfoDto.class);


                //组装返回数据
                rtn.setRows(bytearrayInfoDtos);
                rtn.setResults(count);
                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            }


        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("getFilesByTargetId==>end");
        return rtn;
    }

    /**
     * 根据文件名称模糊查询,获得文件信息列表
     *
     * @param fileName 文件名称
     * @return
     */
    @Override
    public BytearrayInfoDto getFilesByFileName(String fileName) throws Exception {
        log.info("getFilesByFileName==>start");
        BytearrayInfoPoCriteria example = new BytearrayInfoPoCriteria();
        BytearrayInfoPoCriteria.Criteria criteria = example.createCriteria();
        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();


        try {
            log.info("getFilesByFileName==>fileName="+fileName);
            criteria.andFileNameLike("%" + fileName + "%");//设置查询条件 -文件名称-模糊查询

            //查询总记录条数
            int count = bytearrayInfoPoMapper.countByExample(example);
            log.info("getFilesByFileName==>total count="+count);

            //获取记录集合
            List<BytearrayInfoPo> bytearrayInfoPos = bytearrayInfoPoMapper.selectByExample(example);

            //拷贝
            List<BytearrayInfoDto> bytearrayInfoDtos = BeanCopyUtils.populateTListbyDListBySpring(bytearrayInfoPos, BytearrayInfoDto.class);


            //组装返回数据
            rtn.setRows(bytearrayInfoDtos);
            rtn.setResults(count);
            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("getFilesByFileName==>end");
        return rtn;
    }


    /**
     * 根据传入的文件信息对象更新文件信息
     *
     * @param bytearrayInfoDto 文件信息对象
     * @return
     */
    @Override
    public BytearrayInfoDto updateBytearrayInfo(BytearrayInfoDto bytearrayInfoDto) throws Exception {
        log.info("updateBytearrayInfo==>start");
        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();

        try {

            if (bytearrayInfoDto == null || (bytearrayInfoDto.getId() == null)) {
                //组装返回数据
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {
                log.info("updateBytearrayInfo==>params="+JSON.toJSONString(bytearrayInfoDto));
                BytearrayInfoPo bytearrayInfoPo = BeanCopyUtils.populateTbyDBySpring(bytearrayInfoDto, BytearrayInfoPo.class);

                bytearrayInfoPoMapper.updateByPrimaryKey(bytearrayInfoPo);

                //组装返回数据
                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            }


        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("updateBytearrayInfo==>end");
        return rtn;
    }


    /**
     * 保存传入的文件信息对象
     *
     * @param bytearrayInfoDto 文件信息对象
     * @return
     */
    @Override
    public BytearrayInfoDto saveBytearrayInfo(BytearrayInfoDto bytearrayInfoDto) throws Exception {
        log.info("saveBytearrayInfo==>start");
        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();

        try {

            if (bytearrayInfoDto == null) {
                log.info("saveBytearrayInfo==>输入参数不能为空");
                //组装返回数据
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {

                BytearrayInfoPo bytearrayInfoPo = BeanCopyUtils.populateTbyDBySpring(bytearrayInfoDto, BytearrayInfoPo.class);

                bytearrayInfoPoMapper.insert(bytearrayInfoPo);

                //组装返回数据
                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            }


        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("saveBytearrayInfo==>end");
        return rtn;
    }


    /**
     * 根据文件编号删除文件信息
     *
     * @param id 文件编号
     * @return
     */
    @Override
    public BytearrayInfoDto deleteBytearrayInfoById(int id) throws Exception {
        log.info("deleteBytearrayInfoById==>start");

        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();

        try {

            log.info("deleteBytearrayInfoById==>id="+id);
            bytearrayInfoPoMapper.deleteByPrimaryKey(id);

            //组装返回数据
            rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
            rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);


        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("deleteBytearrayInfoById==>end");
        return rtn;
    }


    /**
     * 根据文件所属对象编号 删除文件信息
     *
     * @param targetId 文件所属对象编号
     * @return
     */
    @Override
    public BytearrayInfoDto deleteBytearrayInfoByTargetId(String targetId) throws Exception {

        log.info("deleteBytearrayInfoByTargetId==>start");
        //创建条件查询对象
        BytearrayInfoPoCriteria example = new BytearrayInfoPoCriteria();
        BytearrayInfoPoCriteria.Criteria criteria = example.createCriteria();


        //返回对象
        BytearrayInfoDto rtn = new BytearrayInfoDto();

        try {

            if (StringUtils.isEmpty(targetId)) {
                //组装返回数据
                rtn.setReturnCode(EDPCodeConstants.INVALID_DATA_CODE);
                rtn.setReturnInfo(EDPCodeConstants.INVALID_DATA_MSG);
            } else {
                log.info("deleteBytearrayInfoByTargetId==>targetId="+targetId);
                criteria.andFileTargetidEqualTo(targetId);

                bytearrayInfoPoMapper.deleteByExample(example);

                //组装返回数据
                rtn.setReturnCode(EDPCodeConstants.SUCCESS_CODE);
                rtn.setReturnInfo(EDPCodeConstants.SUCCESS_MSG);
            }


        } catch (Exception e) {
            e.printStackTrace();
            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);
        }

        log.info("deleteBytearrayInfoByTargetId==>end");
        return rtn;
    }

	@Override
	public BytearrayInfoDto findPicById(String id) {
		BytearrayInfoPoCriteria example = new BytearrayInfoPoCriteria();
	    BytearrayInfoPoCriteria.Criteria criteria = example.createCriteria();
	    criteria.andFileTargetidEqualTo(id);
	    List<BytearrayInfoPo> po=bytearrayInfoPoMapper.selectByExampleWithBLOBs(example);
	    List<BytearrayInfoDto> bytearrayInfoDtos = BeanCopyUtils.populateTListbyDListBySpring(po, BytearrayInfoDto.class);
		return bytearrayInfoDtos.get(0);
	}


    /**
     * 查询条件组装
     * @param queryObj
     * @param criteria
     * @param condition
     */
    private void composeCondition(BytearrayInfoPoCriteria queryObj,BytearrayInfoPoCriteria.Criteria criteria,BytearrayInfoDto condition){

        log.info("查询条件组装开始");

        log.info("传入的参数="+JSON.toJSONString(condition));
        if(queryObj != null && criteria != null && condition != null){
            if(condition.getId()!= null){//主键

                criteria.andIdEqualTo(condition.getId());
            }

            if(StringUtils.isNotEmpty(condition.getFileName())){//文件名称
                criteria.andFileNameLike("%"+condition.getFileName()+"%");
            }

            if(StringUtils.isNotEmpty(condition.getFileTargetid())){//文件所属对象编号
                criteria.andFileTargetidEqualTo(condition.getFileTargetid());
            }

            if(condition.getFileVersion() != null){//文件版本
                criteria.andFileVersionEqualTo(condition.getFileVersion());
            }

            if(StringUtils.isNotEmpty(condition.getFileType())){//文件类型
                criteria.andFileTypeEqualTo(condition.getFileType());
            }

            if(StringUtils.isNotEmpty(condition.getFileCreator())){//创建人
                criteria.andFileCreatorEqualTo(condition.getFileCreator());
            }

            log.info("查询条件组装开始");
        }
    }
}
