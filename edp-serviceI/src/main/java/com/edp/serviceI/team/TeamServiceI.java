package com.edp.serviceI.team;

import java.util.List;

import com.edp.serviceI.dto.TeamInfoDto;

public interface TeamServiceI {

	List<TeamInfoDto> findTeamByUserId(Integer id);

	Integer addTream(TeamInfoDto teamDto,Integer userId);
	
}
