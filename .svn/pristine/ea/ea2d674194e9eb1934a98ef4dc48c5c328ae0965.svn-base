package com.edp.admin.team;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.admin.columnRuleRef.ColumnRuleRefController;
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.TeamInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.team.TeamServiceI;
import com.google.gson.Gson;

@Controller
@RequestMapping("/TeamController")
public class TeamController {
	@Autowired
	private TeamServiceI teamServiceI;
	private static final Logger LOGGER = LoggerFactory.getLogger(ColumnRuleRefController.class);
	private Gson gson = new Gson();
	
	@RequestMapping(value = "/getAllTream.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String getAllTream(HttpSession session){
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		List<TeamInfoDto> teamDto=teamServiceI.findTeamByUserId(userDto.getId());
		return gson. toJson(teamDto);
	}
	
	@RequestMapping(value = "/addTream.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addTream(TeamInfoDto teamDto,HttpSession session){
		//获取系统时间
	    Date today = new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		teamDto.setId(SequenceManage.getSequence(""));
		teamDto.setTeamCreat(userDto.getUserName());
		teamDto.setTeamCreattime(sdf.format(today));
		Integer team=teamServiceI.addTream(teamDto,userDto.getId());
		return gson. toJson(team);
	}

}
