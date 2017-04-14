package com.edp.dao.mapper;

import com.edp.dao.domain.FunColumnPo;
import com.edp.dao.domain.FunColumnPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunColumnPoMapper {
    int countByExample(FunColumnPoCriteria example);

    int deleteByExample(FunColumnPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(FunColumnPo record);

    int insertSelective(FunColumnPo record);

    List<FunColumnPo> selectByExample(FunColumnPoCriteria example);

    FunColumnPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FunColumnPo record, @Param("example") FunColumnPoCriteria example);

    int updateByExample(@Param("record") FunColumnPo record, @Param("example") FunColumnPoCriteria example);

    int updateByPrimaryKeySelective(FunColumnPo record);

    int updateByPrimaryKey(FunColumnPo record);

	List<String> findControlByPicId(@Param("func_pic")String taskId);
}