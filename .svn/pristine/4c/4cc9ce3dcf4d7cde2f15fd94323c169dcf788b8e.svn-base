package com.edp.admin.mail;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.serviceI.dto.MailInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.mail.MailInfoServiceI;
import com.google.gson.Gson;


@Controller
@RequestMapping("MailController")
public class MailController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MailController.class);
    
    
    @Resource
    private MailInfoServiceI mailInfoService;
    
    private Gson gson = new Gson();
    
    /**
     * 查询站内信，
     * zhang_cancan 2016/9/7
     * state 状态已读未读
     * pageNow 当前页
     * pageSize 条数
     */
    @RequestMapping(value = "/getMailByUserId.action", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getMailByUserId(String state,Integer pageNow,Integer pageSize,HttpSession session){
  		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
    	List<MailInfoDto> dto=mailInfoService.getMailByUserId(state,user.getId(),pageNow,pageSize);
    	return gson.toJson(dto);
    }
    
    
    /**
     * 修改状态
     * zhang_cancan 2016/9/7
     */
    @RequestMapping(value = "/editMail.action", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String editMail(Integer id){
    	MailInfoDto dto=new MailInfoDto();
    	dto.setId(id);
    	dto.setMailState("01");
    	mailInfoService.editMail(dto);
    	dto=mailInfoService.findMailById(id);
    	return gson.toJson(dto);
    }

}
