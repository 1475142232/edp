package com.edp.dao.mapper;

import com.edp.dao.domain.TeamInfoPo;
import com.edp.dao.domain.TeamInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamInfoPoMapper {
    int countByExample(TeamInfoPoCriteria example);

    int deleteByExample(TeamInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TeamInfoPo record);

    int insertSelective(TeamInfoPo record);

    List<TeamInfoPo> selectByExample(TeamInfoPoCriteria example);

    TeamInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TeamInfoPo record, @Param("example") TeamInfoPoCriteria example);

    int updateByExample(@Param("record") TeamInfoPo record, @Param("example") TeamInfoPoCriteria example);

    int updateByPrimaryKeySelective(TeamInfoPo record);

    int updateByPrimaryKey(TeamInfoPo record);
    
    List<TeamInfoPo> findTeamByUserId(@Param("user_id")Integer id);

	Integer insertUser(@Param("user_id")Integer id, @Param("team_id")String parseInt, @Param("role_type")int i);
}