package com.edp.admin.menu;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.serviceI.dto.MenuInfoDto;
import com.edp.serviceI.menu.MenuInfoServiceI;
import com.google.gson.Gson;

/**
 * ClassName:MenuController
 * Date:     2016年5月19日 
 * @author   zhang_cancan
 * @version
 * @since    
 * @see
 */

@Controller
@RequestMapping("menuController")
public class MenuController {
	
	@Autowired
	private MenuInfoServiceI menInfoServiceI;
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuController.class);
	private Gson gson = new Gson();
	
	//查看列表
	@RequestMapping(value = "/menuList.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findAllMenu(MenuInfoDto dto){
		MenuInfoDto menuInfo=menInfoServiceI.findAllMenu(dto);
		return gson.toJson(menuInfo);
	}
	
	//查找树
	@RequestMapping(value = "/findTree.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findTree(Integer roleId){
		List<MenuInfoDto> menu=menInfoServiceI.findTreeBy(0);
		for(int i=0;i<menu.size();i++){
			menu.get(i).setText(menu.get(i).getMenuName());
			menu.get(i).setExpanded(true);
			List<MenuInfoDto> children = menInfoServiceI.findTreeBy(menu.get(i).getId());
			for(int j=0;j<children.size();j++){
			     Integer count = menInfoServiceI.countMenuByRoleId(roleId,children.get(j).getId());
			     children.get(j).setText(children.get(j).getMenuName());
			     if(count!=0){
			    	 children.get(j).setChecked(true);
			     }
			}
			menu.get(i).setChildren(children);
		}
		return gson.toJson(menu);
	}
	
	@RequestMapping(value = "/saveMenu.action" , method = {RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String saveMenu(Integer roleId,String str_menu){
		menInfoServiceI.delMenuByRoleId(roleId);
		String[] menu=str_menu.split(",");
		for(int i=0;i<menu.length;i++){
			if(menu[i]!=""){
			   menInfoServiceI.addMenuByRoleId(roleId,Integer.parseInt(menu[i]));
			}
		}
		return gson.toJson("1");
	}


}
