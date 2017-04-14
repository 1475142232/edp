package com.edp.admin.role;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.edp.serviceI.dto.RoleDto;
import com.edp.serviceI.dto.UserDto;
import com.edp.serviceI.menu.MenuInfoServiceI;
import com.edp.serviceI.role.RoleInfoServiceI;
import com.edp.serviceI.user.UserServiceI;
import com.google.gson.Gson;

@Controller
@RequestMapping("roleController")
public class RoleController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

	private Gson gson = new Gson();
	
	 @Resource
	 private RoleInfoServiceI roleInfoServiceI;
	 @Autowired
	 private UserServiceI userServiceI;
	 @Autowired
	 private MenuInfoServiceI menInfoServiceI;
	
	/**
	 * @author zhang_cancan
	 * @time 2016/5/20
	 */
	@RequestMapping(value = "/findTreeById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findTreeById(HttpSession session){
		UserDto userDto=(UserDto)session.getAttribute("user");
		List<RoleDto> roles = roleInfoServiceI.findRoleByDeptId(userDto.getUserDept());
		for(int i=0;i<roles.size();i++){
//			List<UserDto> useres=userServiceI.findUserByRoleId(roles.get(i).getId());
			List<RoleDto> role = new ArrayList<RoleDto>();
//			for(int j=0;j<useres.size();j++){
//				RoleDto rdto=new RoleDto(); 
//				rdto.setId(useres.get(j).getId());
//				rdto.setText(useres.get(j).getUserName());
//			    rdto.setParent(roles.get(i).getId());
//				role.add(rdto);
//			}
			roles.get(i).setText(roles.get(i).getRoleName());
			roles.get(i).setChildren(role);
			roles.get(i).setExpanded(true);
		}
		return gson.toJson(roles);
	}
	
	/**
	 * @author zhang_cancan
	 * @time 2016/5/20
	 */
	@RequestMapping(value = "/addRoleInfo.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addRoleInfo(RoleDto dto,HttpSession session){
		UserDto userDto=(UserDto)session.getAttribute("user");
		dto.setRoleDept(userDto.getUserDept());
		roleInfoServiceI.addRoleInfo(dto);
		return gson.toJson(dto);
	}
	/**
	 * @author zhang_cancan
	 * @time 2016/5/24
	 */
	@RequestMapping(value = "/delRole.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String delRole(Integer id){
		menInfoServiceI.delMenuByRoleId(id);
		Integer del=roleInfoServiceI.delUserInfo(id);
		Integer res=roleInfoServiceI.delRoleInfo(id);
		return gson.toJson(res);
	}
	/**
	 * @author zhang_cancan
	 * @time 2016/5/24
	 */
	@RequestMapping(value = "/addUserInfo.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addUserInfo(Integer id,String userIds){
		String[] userId=userIds.split(",");
		Integer del=roleInfoServiceI.delUserInfo(id);
		for(int i=0;i<userId.length;i++){
			if(userId[i]!=""){
		        Integer res=roleInfoServiceI.addUserInfo(id,Integer.parseInt(userId[i]));
			}
		}
		return gson.toJson(del);
	}
}
