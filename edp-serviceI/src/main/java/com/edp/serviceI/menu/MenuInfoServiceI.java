package com.edp.serviceI.menu;



import java.util.List;

import com.edp.serviceI.dto.MenuInfoDto;

public interface MenuInfoServiceI {

	MenuInfoDto findAllMenu(MenuInfoDto dto);

	List<MenuInfoDto> findTreeBy(int i);

	Integer countMenuByRoleId(Integer roleId, Integer menuId);

	Integer delMenuByRoleId(Integer roleId);

	Integer addMenuByRoleId(Integer roleId, Integer string);

}
