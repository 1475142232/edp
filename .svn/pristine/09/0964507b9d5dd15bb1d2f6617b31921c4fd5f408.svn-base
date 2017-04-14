package com.edp.admin.reply;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.serviceI.dto.ReplyInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.reply.ReplyServiceI;
import com.google.gson.Gson;


/**
 * 
 * @author zhang_cancan
 * @time 2016/9/13
 *
 */
@Controller
@RequestMapping("ReplyController")
public class ReplyController {
	
	@Autowired 
	private ReplyServiceI replyServiceI;
	
	private static final Logger log = LoggerFactory.getLogger(ReplyController.class);

	private Gson gson = new Gson();
	
	@RequestMapping(value = "/addReply.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addReply(ReplyInfoDto dto, HttpSession session){
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		Date today = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    dto.setReplyTime(sdf.format(today));
	    dto.setReplyUserId(userDto.getId()+"");
	    dto.setReplyUserName(userDto.getUserName());
	    replyServiceI.addReply(dto);
	    return gson.toJson(dto);
	}

}
