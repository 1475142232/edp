package com.edp.admin.functionInfo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.admin.common.BaseController;
import com.edp.serviceI.dto.FunctionInfoDto;
import com.edp.serviceI.functionInfo.FunctionInfoServiceI;
import com.google.gson.Gson;




@Controller
@RequestMapping("functionInfoController")
public class FunctionInfoController extends BaseController {

    @Autowired
    private FunctionInfoServiceI functionInfoServiceI;
	private static final Logger LOGGER = LoggerFactory.getLogger(FunctionInfoController.class);
	private Gson gson = new Gson();
  
    
    
    /**
     * 修改功能
     * 2016/9/21
     * zhang_cancan
     */
	@RequestMapping(value = "/editFcuntion.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editFcuntion(FunctionInfoDto dto){
		functionInfoServiceI.editFcuntion(dto);
		return gson.toJson("0000");
	}
    
    /**
     * 保存关联
     */
	@RequestMapping(value = "/addFuncitonByScene.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addFuncitonByScene(String functionId,String SceneId,String controlId){
		functionInfoServiceI.addFuncitonByScene(functionId,SceneId,controlId);
		return gson.toJson("0000");
	}
    
   

}
