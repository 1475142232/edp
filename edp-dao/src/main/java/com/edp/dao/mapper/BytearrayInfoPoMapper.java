package com.edp.dao.mapper;

import com.edp.dao.domain.BytearrayInfoPo;
import com.edp.dao.domain.BytearrayInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BytearrayInfoPoMapper {
    int countByExample(BytearrayInfoPoCriteria example);

    int deleteByExample(BytearrayInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(BytearrayInfoPo record);

    int insertSelective(BytearrayInfoPo record);

    List<BytearrayInfoPo> selectByExampleWithBLOBs(BytearrayInfoPoCriteria example);

    List<BytearrayInfoPo> selectByExample(BytearrayInfoPoCriteria example);

    BytearrayInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BytearrayInfoPo record, @Param("example") BytearrayInfoPoCriteria example);

    int updateByExampleWithBLOBs(@Param("record") BytearrayInfoPo record, @Param("example") BytearrayInfoPoCriteria example);

    int updateByExample(@Param("record") BytearrayInfoPo record, @Param("example") BytearrayInfoPoCriteria example);

    int updateByPrimaryKeySelective(BytearrayInfoPo record);

    int updateByPrimaryKeyWithBLOBs(BytearrayInfoPo record);

    int updateByPrimaryKey(BytearrayInfoPo record);
}