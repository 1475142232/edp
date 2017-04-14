package com.edp.admin.tree;

import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.TaskInfoDto;
import com.edp.serviceI.dto.TreeInfoDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.fence.FenceInfoServiceI;
import com.edp.serviceI.taskInfo.TaskInfoServiceI;
import com.edp.serviceI.tree.TreeServiceI;
import com.google.gson.Gson;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 
 * tree请求模块
 * @time  2016/4/20
 * @author zhang_cancan
 *
 */
@Controller
@RequestMapping("TreeController")
public class TreeController {
	
	@Autowired
	private TreeServiceI treeServiceI;
    @Resource
    private TaskInfoServiceI taskInfoServiceI;
	@Autowired
	private FenceInfoServiceI fenceService;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TreeController.class);
	private Gson gson = new Gson();
	
	@RequestMapping(value = "/findTreeById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findTreeById(String productId){
		TreeInfoDto tree=treeServiceI.findTreeById(productId);
		return gson.toJson(tree);		
	}
	
	/**
	 * 查询场景、功能等
	 * zhang_cancan 2016/9/18
	 */
	@RequestMapping(value = "/findTreeByType.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findTreeByType(String productId,String type){
		List<TreeInfoDto> typeTree = treeServiceI.findTreeByType(productId,type);
		return gson.toJson(typeTree);
	}
	

	/**
	 * 
	 * @param id
	 * @return List<TreeInfoDto>
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 根据父id 得到对应的子节点
	 */
	@RequestMapping(value = "/findTreeNodeByPid.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findSceneListByPid(String id){
		List<TreeInfoDto> dto=treeServiceI.findTreeNodeByPid(id);
		return gson.toJson(dto);
	}

	/**
	 * 
	 * @param id
	 * @return "0000"
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 新增场景
	 */
	@RequestMapping(value = "/addSceneByTree.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addSceneByTree(TreeInfoDto dto,HttpSession session){
		String id = SequenceManage.getSequence("");
		Date today = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
		dto.setId(id);
		dto.setTreeCreat(user.getId());
		dto.setTreeCreattime(sdf.format(today));
		dto.setTreeState("01");
		dto.setTreeType("60");
		treeServiceI.addTreeNode(dto);
		return gson.toJson("0000");
	}
	
	/**
	 * 
	 * @param id
	 * @return "0000"
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 新增原型图
	 */
	@RequestMapping(value = "/addPicByTree.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addPicByTree(TreeInfoDto dto,HttpSession session){
		String id = SequenceManage.getSequence("");
		Date today = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
		dto.setId(id);
		dto.setTreeCreat(user.getId());
		dto.setTreeCreattime(sdf.format(today));
		dto.setTreeState("01");
		dto.setTreeType("80");
		treeServiceI.addTreeNode(dto);
		return gson.toJson("0000");
	}
	/**
	 * 
	 * @param id
	 * @return "0000"
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 新增功能
	 */
	@RequestMapping(value = "/addFunctionByTree.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody	
	public String addFunctionByTree(TreeInfoDto dto,HttpSession session){
		List<TreeInfoDto> typeTree = treeServiceI.findTreeByType(dto.getTreeId(),"3");
		String id = SequenceManage.getSequence("");
		Date today = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserInfoDto user=(UserInfoDto)session.getAttribute("user");
		dto.setId(id);
		dto.setTreeCreat(user.getId());
		dto.setTreeCreattime(sdf.format(today));
		dto.setTreeState("01");
		dto.setTreeType("8");
		dto.setTaskId(id);
		dto.setTreeParent(typeTree.get(0).getId());
		treeServiceI.addFunctionByTree(dto);
		TaskInfoDto taskInfo = new TaskInfoDto();
		taskInfo.setId(id);
		taskInfo.setProductId(dto.getTreeId());
		taskInfo.setTaskName(dto.getTreeName());
		taskInfo.setTaskSpec(dto.getTreeName());
		taskInfo.setTaskCreateTime(sdf.format(today));
		taskInfo.setTaskState("00");
		taskInfo.setTaskType("05");
		taskInfo.setFenceId(fenceService.findFenceIdByType(dto.getTreeId(),"03"));
		taskInfoServiceI.addTaskInfo(taskInfo);
		return gson.toJson("0000");
	}
	/**
	 * @param id
	 * @return "0000"
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 修改信息
	 */
	@RequestMapping(value = "/editTreeNode.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editTreeNode(TreeInfoDto dto){
		treeServiceI.editTreeNode(dto);
		return gson.toJson("0000");
	}
	
	/**
	 * @param id
	 * @return TreeInfoDto
	 * @author zhang_cancan
	 * @time 2016/9/21
	 * 
	 * 根据id查询节点
	 */
	@RequestMapping(value = "/findTreeNodeById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findTreeNodeById(String id){
		TreeInfoDto dto=treeServiceI.findTreeNodeById(id);
		return gson.toJson(dto);
	}
}
