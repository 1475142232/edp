package com.edp.service.team;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.TeamInfoPo;
import com.edp.dao.domain.TeamInfoPoCriteria;
import com.edp.dao.mapper.TeamInfoPoMapper;
import com.edp.serviceI.dto.TeamInfoDto;
import com.edp.serviceI.team.TeamServiceI;

@Service("TeamServiceI")
public class TeamServiceImpl implements TeamServiceI{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TeamServiceImpl.class);
	
	@Autowired
	private TeamInfoPoMapper teamInfoMapper;

	@Override
	public List<TeamInfoDto> findTeamByUserId(Integer id) {
		List<TeamInfoPo> teamInfoPo=teamInfoMapper.findTeamByUserId(id);
		return BeanCopyUtils.populateTListbyDListBySpring(teamInfoPo, TeamInfoDto.class);
	}

	@Override
	public Integer addTream(TeamInfoDto teamDto,Integer userId) {
		TeamInfoPo teamPo=BeanCopyUtils.populateTbyDBySpring(teamDto, TeamInfoPo.class);
		teamInfoMapper.insert(teamPo);
		TeamInfoPoCriteria example = new TeamInfoPoCriteria();
		TeamInfoPoCriteria.Criteria teamCrteria = example.createCriteria();
		teamCrteria.andTeamCreatEqualTo(teamDto.getTeamCreat());
		teamCrteria.andTeamCreattimeEqualTo(teamDto.getTeamCreattime());
		List<TeamInfoPo> result = teamInfoMapper.selectByExample(example);
		return teamInfoMapper.insertUser(userId, result.get(0).getId(), 1);
	}

}
