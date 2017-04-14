package com.edp.admin.problem;

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

import com.edp.serviceI.dto.ProblemInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.problem.ProblemServiceI;
import com.google.gson.Gson;


/**
 * 
 * 
 * @author zhang_cancan  2016-9-8
 *
 */
@Controller
@RequestMapping("ProblemController")
public class ProblemController {
	
	
	@Autowired
	private ProblemServiceI problemService;
	
	private static final Logger log = LoggerFactory.getLogger(ProblemController.class);
	
	private Gson gson = new Gson();

	@RequestMapping(value = "/problemList.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String problemList(String teamId,Integer type,ProblemInfoDto dto, HttpSession session){
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		if(type == 1){
			dto.setProblemStarteName(userDto.getUserName());		
		}
		if(type == 2){
			dto.setProblemEndName(userDto.getUserName());
		}
		List<ProblemInfoDto> problem=problemService.findProblem(dto);
	    return gson.toJson(problem);
	}
	
	@RequestMapping(value = "/findProblemById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findProblemById(Integer problemId){
		ProblemInfoDto dto = problemService.findProblemById(problemId);
		 return gson.toJson(dto);
	} 
	
	@RequestMapping(value = "/editProblem.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editProblem(ProblemInfoDto dto){
		problemService.editProblem(dto);
		return gson.toJson("0000");
	}
	
	@RequestMapping(value = "/addProblem.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addProblem(ProblemInfoDto dto, HttpSession session){
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dto.setProblemStarteUser(userDto.getId());
		dto.setProblemStarteName(userDto.getUserName());
		dto.setProblemStarteTime(sdf.format(today));
		dto.setProblemState("01");
		problemService.addProblem(dto);
		return gson.toJson("0000");
	}

}
