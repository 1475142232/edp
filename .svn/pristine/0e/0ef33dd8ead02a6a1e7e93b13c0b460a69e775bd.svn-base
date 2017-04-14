package com.edp.dao.mapper;

import com.edp.dao.domain.DictionaryInfoPo;
import com.edp.dao.domain.DictionaryInfoPoCriteria;
import com.edp.dao.domain.TableInfoPo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryInfoPoMapper {
	DictionaryInfoPo selectByPrimaryKey(int id);
	
	int updateByPrimaryKey(int id);
	
    int countByExample(DictionaryInfoPoCriteria example);

    int deleteByExample(DictionaryInfoPoCriteria example);

    int deleteById(int id);
    
    int insert(DictionaryInfoPo record);

    int insertSelective(DictionaryInfoPo record);

    List<DictionaryInfoPo> selectByExample(DictionaryInfoPoCriteria example);

    int updateByExampleSelective(@Param("record") DictionaryInfoPo record, @Param("example") DictionaryInfoPoCriteria example);

    int updateByPrimaryKeySelective(DictionaryInfoPo record);
    
    int updateByExample(@Param("record") DictionaryInfoPo record, @Param("example") DictionaryInfoPoCriteria example);
}