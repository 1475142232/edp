package com.edp.dao.mapper;

import com.edp.dao.domain.TableInfoPo;
import com.edp.dao.domain.TableInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableInfoPoMapper {
    int countByExample(TableInfoPoCriteria example);

    int deleteByExample(TableInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TableInfoPo record);

    int insertSelective(TableInfoPo record);

    List<TableInfoPo> selectByExample(TableInfoPoCriteria example);

    TableInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TableInfoPo record, @Param("example") TableInfoPoCriteria example);

    int updateByExample(@Param("record") TableInfoPo record, @Param("example") TableInfoPoCriteria example);

    int updateByPrimaryKeySelective(TableInfoPo record);

    int updateByPrimaryKey(TableInfoPo record);
}