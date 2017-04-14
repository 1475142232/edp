package com.edp.admin.table;

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
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.TableInfoDto;
import com.edp.serviceI.dto.UserDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.tableinfo.TableInfoServiceI;
import com.google.gson.Gson;

@Controller
@RequestMapping("tableController")
public class TableController extends BaseController{
	@Autowired
	private TableInfoServiceI tableInfoService;
	
	
private static final Logger LOGGER = LoggerFactory.getLogger(TableController.class);

	private Gson gson = new Gson();
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/tablelist.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String tablelist(TableInfoDto dto){
		List<TableInfoDto> dtoes=tableInfoService.getAllTables(dto);
		return gson.toJson(dtoes);
	}
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/addTable.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addTable(TableInfoDto dto, HttpSession session){
		Date today = new Date();
  		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
  		dto.setId(SequenceManage.getSequence(""));
  		dto.setTableState("01");
  		dto.setTableCreat(user.getUserName());
  		dto.setTableCreattime(sdf.format(today));
		tableInfoService.addTable(dto);
		return gson.toJson("0000");
	}
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/editTable.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editTable(TableInfoDto dto, HttpSession session){
		Date today = new Date();
  		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
  		dto.setModifyCreat(user.getUserName());
  		dto.setModifyCreattime(sdf.format(today));
  		tableInfoService.editTable(dto);
  		return gson.toJson("0000");
	}
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/findTableById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findTableById(TableInfoDto dto){
		dto=tableInfoService.findTableById(dto);
		return gson.toJson(dto);
	}
}
