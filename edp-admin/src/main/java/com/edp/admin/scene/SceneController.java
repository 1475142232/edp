package com.edp.admin.scene;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.admin.common.BaseController;
import com.edp.serviceI.dto.TreeInfoDto;
import com.edp.serviceI.sceneinfo.SceneInfoServiceI;
import com.edp.serviceI.tree.TreeServiceI;
import com.google.gson.Gson;

@Controller
@RequestMapping("sceneController")
public class SceneController extends BaseController{
	
	@Autowired
	private TreeServiceI treeServiceI;
	
	
	
private static final Logger LOGGER = LoggerFactory.getLogger(SceneController.class);

	private Gson gson = new Gson();
	
	
	/**
	 * 
	 * @param id
	 * @return List<TreeInfoDto>
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 新增场景
	 */
	@RequestMapping(value = "/addScene.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findSceneListByPid(String id){
		List<TreeInfoDto> dto=treeServiceI.findTreeNodeByPid(id);
		return gson.toJson(dto);
	}

	
}
