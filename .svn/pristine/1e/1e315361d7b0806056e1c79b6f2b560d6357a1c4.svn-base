package com.edp.admin.rule;

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

import com.edp.admin.common.BaseController;
import com.edp.admin.login.UserInfoBean;
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.RuleInfoDto;
import com.edp.serviceI.ruleinfo.RuleInfoServiceI;
import com.google.gson.Gson;
@Controller
@RequestMapping("ruleController")
public class RuleController extends BaseController{
	@Autowired
	private RuleInfoServiceI ruleInfoService;
	
	
private static final Logger LOGGER = LoggerFactory.getLogger(RuleController.class);

	private Gson gson = new Gson();
	
	@RequestMapping(value = "/rulelist.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String getAllRules(RuleInfoDto dto){
		RuleInfoDto allRules = ruleInfoService.getAllRules(dto);
		return gson.toJson(allRules);
	}
	//根据id查询商品
	@RequestMapping(value = "/getruleById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String selectRuleById(String Id){
		RuleInfoDto ruleById = ruleInfoService.getRuleById(Id);
		return gson.toJson(ruleById);
	}
	
	//添加商品
	@RequestMapping(value = "/addrule.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addtable(RuleInfoDto dto, HttpSession session){
		Date today = new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//获取session中的用户信息
		UserInfoBean userInfoBean=(UserInfoBean)session.getAttribute("userInfoBean");
		dto.setRuleCreater(userInfoBean.getUsername());
		dto.setRuleCreateTime(sdf.format(today));
		dto.setRuleType("03");
		ruleInfoService.addRule(dto);
		return gson.toJson(dto);
	}
	//修改商品
	@RequestMapping(value = "/updaterule.action" , method = { RequestMethod.GET,RequestMethod.POST })
	public String updateTable(RuleInfoDto dto){
		ruleInfoService.updateRule(dto);
		return null;
	}
	//删除商品
	@RequestMapping(value = "/delrule.action" , method = { RequestMethod.GET,RequestMethod.POST })
	public String delRule(String Id){
		ruleInfoService.delRule(Id);
		return null;
	}
	
	//自定义查询方法
	@RequestMapping(value = "/findRuleByProduceId.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findRuleByProduceId(String ruleProduct){
		List<RuleInfoDto> dto=ruleInfoService.findRuleByProduceId(ruleProduct);
		return gson.toJson(dto);
	}
    /**
     * @author zhang_cancan 2016/5/10
     * 增加
     */
	@RequestMapping(value = "/addRuleToSQl.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addRuleToSQl(String userColumn, HttpSession session){
		String id=SequenceManage.getSequence("");
		RuleInfoDto dto=new RuleInfoDto();
		dto.setRuleName(userColumn);
		Date today = new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//获取session中的用户信息
	    dto.setId(id);
		UserInfoBean userInfoBean=(UserInfoBean)session.getAttribute("userInfoBean");
		dto.setRuleCreater(userInfoBean.getUsername());
		dto.setRuleCreateTime(sdf.format(today));                                                     
		dto.setRuleType("03");
		ruleInfoService.addRule(dto);                           
		return gson.toJson(id);
	}
	/**
	 * @author zhang_cancan 2016/5/10
	 * 删除
	 */
	@RequestMapping(value = "/delRuleToSQl.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addRuleToSQl(String id){
		ruleInfoService.delRule(id);
		return gson.toJson(id);
	}
}
