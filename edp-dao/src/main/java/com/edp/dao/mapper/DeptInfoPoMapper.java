package com.edp.dao.mapper;

import com.edp.dao.domain.DeptInfoPo;
import com.edp.dao.domain.DeptInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptInfoPoMapper {
    int countByExample(DeptInfoPoCriteria example);

    int deleteByExample(DeptInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeptInfoPo record);

    int insertSelective(DeptInfoPo record);

    List<DeptInfoPo> selectByExample(DeptInfoPoCriteria example);

    DeptInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeptInfoPo record, @Param("example") DeptInfoPoCriteria example);

    int updateByExample(@Param("record") DeptInfoPo record, @Param("example") DeptInfoPoCriteria example);

    int updateByPrimaryKeySelective(DeptInfoPo record);

    int updateByPrimaryKey(DeptInfoPo record);
}