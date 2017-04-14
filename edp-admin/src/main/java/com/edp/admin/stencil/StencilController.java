package com.edp.admin.stencil;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpSession;

import com.edp.common.constant.Constants;

import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.admin.common.BaseController;
import com.edp.admin.login.UserInfoBean;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.columnInfo.ColumnInfoServiceI;
import com.edp.serviceI.dto.ColumnInfoDto;
import com.edp.serviceI.dto.ControlDto;
import com.edp.serviceI.dto.CtableDto;
import com.edp.serviceI.dto.FunctionInfoDto;
import com.edp.serviceI.dto.ModuleInfoDto;
import com.edp.serviceI.dto.RequestmentDto;
import com.edp.serviceI.dto.SceneInfoDto;
import com.edp.serviceI.dto.StencilDto;
import com.edp.serviceI.dto.TableInfoDto;
import com.edp.serviceI.dto.TreeDto;
import com.edp.serviceI.functionInfo.FunctionInfoServiceI;
import com.edp.serviceI.moduleinfo.ModuleInfoServiceI;
import com.edp.serviceI.sceneinfo.SceneInfoServiceI;
import com.edp.serviceI.stencil.StencilServiceI;
import com.edp.serviceI.tableinfo.TableInfoServiceI;
import com.edp.serviceI.tree.TreeServiceI;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;

@Controller
@RequestMapping("stencilController")
public class StencilController extends BaseController{
	
	@Autowired
	private StencilServiceI stencilServiceI;
	
}
