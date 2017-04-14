package com.edp.dao.mapper;

import com.edp.dao.domain.PicInfoPo;
import com.edp.dao.domain.PicInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicInfoPoMapper {
    int countByExample(PicInfoPoCriteria example);

    int deleteByExample(PicInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(PicInfoPo record);

    int insertSelective(PicInfoPo record);

    List<PicInfoPo> selectByExampleWithBLOBs(PicInfoPoCriteria example);

    List<PicInfoPo> selectByExample(PicInfoPoCriteria example);

    PicInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PicInfoPo record, @Param("example") PicInfoPoCriteria example);

    int updateByExampleWithBLOBs(@Param("record") PicInfoPo record, @Param("example") PicInfoPoCriteria example);

    int updateByExample(@Param("record") PicInfoPo record, @Param("example") PicInfoPoCriteria example);

    int updateByPrimaryKeySelective(PicInfoPo record);

    int updateByPrimaryKeyWithBLOBs(PicInfoPo record);

    int updateByPrimaryKey(PicInfoPo record);
}