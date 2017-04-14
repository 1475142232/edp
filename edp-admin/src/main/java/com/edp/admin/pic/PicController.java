package com.edp.admin.pic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.serviceI.dto.TreeInfoDto;
import com.edp.serviceI.tree.TreeServiceI;
import com.google.gson.Gson;


@Controller
@RequestMapping("PicController")
public class PicController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PicController.class);
	
	private Gson gson = new Gson();
	
	@Autowired
	private TreeServiceI treeServiceI;
	
	/**
	 * 
	 * @param id
	 * @return List<TreeInfoDto>
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 根据父id 得到对应的场景列表
	 */
	@RequestMapping(value = "/findPicListByPid.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findSceneListByPid(String id){
		List<TreeInfoDto> dto=treeServiceI.findTreeNodeByPid(id);
		return gson.toJson(dto);
	}
	

}
