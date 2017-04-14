package com.edp.admin.fence;

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

import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.FenceInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.fence.FenceInfoServiceI;
import com.google.gson.Gson;

@Controller
@RequestMapping("fenceController")
public class FenceController {
	
	private static final Logger log = LoggerFactory.getLogger(FenceController.class);

	private Gson gson = new Gson();
	
	@Autowired
	private FenceInfoServiceI fenceService;
	
	@RequestMapping(value = "/getAllFence.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String getAllFence(String productId,String taskState){
		List<FenceInfoDto> fence=fenceService.getAllFence(productId,"01",taskState);
		return gson.toJson(fence);
	}
	
	@RequestMapping(value = "/addFence.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addFence(FenceInfoDto fence,String productId,HttpSession session){
  		Date today = new Date();
  		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
  		String id=SequenceManage.getSequence("");
  		fence.setId(id);
  		fence.setFenceState("01");
  		fence.setFenceType("07");
  		fence.setFenceCreat(user.getUserName());
  		fence.setFenceCreattime(sdf.format(today));
		fenceService.addFence(fence);
		fenceService.addFencProductId(id,productId);
		return gson.toJson("0000");
	}
	
	@RequestMapping(value = "/editFence.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editFence(FenceInfoDto fence){
		System.out.println(fence.getId());
		fence.setFenceState("00");
		fenceService.editFence(fence);
		return gson.toJson("0000");
	}

}
