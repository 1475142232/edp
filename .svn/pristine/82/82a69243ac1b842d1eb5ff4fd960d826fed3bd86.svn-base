package com.edp.admin.columnInfoController;






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
import com.edp.serviceI.columnInfo.ColumnInfoServiceI;
import com.edp.serviceI.dto.ColumnInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.google.gson.Gson;



@Controller
@RequestMapping("columnInfoController")
public class ColumnInfoController{
	@Autowired
	private ColumnInfoServiceI columnInfoServiceI;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ColumnInfoController.class);
	
	private Gson gson = new Gson();
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/columnlist.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String columnlist(ColumnInfoDto dto){
		dto = columnInfoServiceI.getColumnList(dto);
		return gson.toJson(dto);
	}
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/addColumn.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addColumn(ColumnInfoDto dto, HttpSession session){
		Date today = new Date();
  		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
  		dto.setId(SequenceManage.getSequence(""));
  		dto.setColumnState("01");
  		dto.setColumnCreat(user.getUserName());
  		dto.setColumnCreattime(sdf.format(today));
  		columnInfoServiceI.addColumn(dto);
  		return gson.toJson("0000");
	}
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/editColumn.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editColumn(ColumnInfoDto dto, HttpSession session){
		Date today = new Date();
  		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
  		dto.setModifyCreat(user.getUserName());
  		dto.setModifyCreattime(sdf.format(today));
  		columnInfoServiceI.editColumn(dto);
  		return gson.toJson("0000");
	}
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	@RequestMapping(value = "/findColumnById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findColumnById(ColumnInfoDto dto){
		dto=columnInfoServiceI.findColumnById(dto);
		return gson.toJson(dto);
	}
}







