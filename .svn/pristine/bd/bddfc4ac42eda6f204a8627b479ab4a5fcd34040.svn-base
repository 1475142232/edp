package com.edp.admin.data;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.xmlgraphics.util.WriterOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.serviceI.columnInfo.ColumnInfoServiceI;
import com.edp.serviceI.data.DataServiceI;
import com.edp.serviceI.dto.ColumnInfoDto;
import com.edp.serviceI.dto.DataInfoDto;
import com.edp.serviceI.dto.TableInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.tableinfo.TableInfoServiceI;
import com.google.gson.Gson;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


/**
 * 
 * @author zhang_cancan
 * 2016-9-5
 *
 */
@Controller
@RequestMapping("DataController")
public class DataController{
	
	@Autowired
	private DataServiceI dataServiceI;
	@Autowired
	private TableInfoServiceI tableInfoService;
	@Autowired
	private ColumnInfoServiceI columnInfoServiceI;
	private static final Logger LOGGER = LoggerFactory.getLogger(DataController.class);
	private Gson gson = new Gson();
	

	
	


	/**
	 * 查询
	 * @time 2016/9/5
     * @author zhang_cancan
	 */
	@RequestMapping(value = "/findAllData.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findAllData(String teamId, HttpSession session){
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		List<DataInfoDto> data=dataServiceI.findAllData(teamId,userDto.getId());
		return gson.toJson(data);
	}
	
	
	/**
	 * 添加
	 * @time 2016/9/5
     * @author zhang_cancan
	 */
	@RequestMapping(value = "/addData.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addData(DataInfoDto dto, HttpSession session){
		 Date today = new Date();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
	     dto.setDataCreat(userDto.getUserName());
	     dto.setDataCreattime(sdf.format(today));
	     dto.setDataState("01");
	     dataServiceI.addData(dto);
	     return gson.toJson("0000");
	}
	
	
	/**
	 * 修改
	 * @time 2016/9/5
     * @author zhang_cancan
	 */
	@RequestMapping(value = "/editData.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editData(DataInfoDto dto){
		dataServiceI.editData(dto);
		return gson.toJson("0000");
	}
	
	/**
	 * 单个查询
	 * @time 2016/9/6
     * @author zhang_cancan
	 */
	@RequestMapping(value = "/findDataById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findDataById(DataInfoDto dto){
		dto=dataServiceI.findDataById(dto);
		return gson.toJson(dto);
	}
	/**
	 * 根据项目id查询表
	 * @time 2016/9/21
	 * @author zhang_cancan
	 * 
	 */
	@RequestMapping(value = "/findDataByproductId.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findDataByproductId(String productId){
		List<DataInfoDto> data=dataServiceI.findDataByproductId(productId);
	    return gson.toJson(data);
	}
	
	/**
	 * freemarker 到处SQL
	 * zhang_cancna
	 * 2016/9/22
	 */
	@RequestMapping(value = "/outSqlByProductId.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public ResponseEntity outSqlByProductId(String dataId,Integer type, HttpServletRequest request,HttpServletResponse response){
		try { 
			request.setCharacterEncoding("utf-8");
			
			Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
			cfg.setDefaultEncoding("utf-8");
			String path  = request.getSession().getServletContext().getRealPath("")+"/templates";
			String classPath = this.getClass().getResource("").toString();
			cfg.setDirectoryForTemplateLoading(new File(path));
	        ByteArrayOutputStream bop = new  ByteArrayOutputStream();
//		    if(type==1){//  type ==1 为mySql
		       Template t = cfg.getTemplate("MySql.ftl");
		       TableInfoDto dto = new TableInfoDto();
		       dto.setDataId(dataId);
		       Map table = new HashMap();   
		       List<TableInfoDto> tables= tableInfoService.getAllTables(dto);
		       table.put("table", tables);
		       for(int i=0 ; i< tables.size() ; i++){
		    	   ColumnInfoDto cDto = new ColumnInfoDto();
		    	   cDto.setTableId(tables.get(i).getId()); 
		    	   tables.get(i).setChildren(columnInfoServiceI.getColumnList(cDto).getData());
		       }
		       if(tables.size()!=0){
		          response.setContentType("text/plain; charset=" + t.getEncoding());  
			      Writer out = new OutputStreamWriter(bop);
			      t.process(table, out); 
			     
		       }

//		    }
		    byte[] bt = bop.toByteArray();
		    HttpHeaders httpHeaders = new HttpHeaders();
		    httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		    String fileName =  "table.txt";
		    httpHeaders.setContentDispositionFormData("attachment", new String(fileName.getBytes("utf-8"), "ISO8859-1"));
		    httpHeaders.set("charset", "utf-8");
		    return new ResponseEntity(bt, httpHeaders, HttpStatus.CREATED);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}  
	
	}
}
