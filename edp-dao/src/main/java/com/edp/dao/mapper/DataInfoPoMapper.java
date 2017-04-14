package com.edp.dao.mapper;

import com.edp.dao.domain.DataInfoPo;
import com.edp.dao.domain.DataInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataInfoPoMapper {
    int countByExample(DataInfoPoCriteria example);

    int deleteByExample(DataInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataInfoPo record);

    int insertSelective(DataInfoPo record);

    List<DataInfoPo> selectByExample(DataInfoPoCriteria example);

    DataInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataInfoPo record, @Param("example") DataInfoPoCriteria example);

    int updateByExample(@Param("record") DataInfoPo record, @Param("example") DataInfoPoCriteria example);

    int updateByPrimaryKeySelective(DataInfoPo record);

    int updateByPrimaryKey(DataInfoPo record);

	List<DataInfoPo> findAllData(@Param("team_id")String teamId, @Param("user_id")Integer userId);
}