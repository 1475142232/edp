package com.edp.service.menu;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.MenuInfoPo;
import com.edp.dao.domain.MenuInfoPoCriteria;
import com.edp.dao.mapper.MenuInfoPoMapper;
import com.edp.serviceI.dto.MenuInfoDto;
import com.edp.serviceI.menu.MenuInfoServiceI;

@Service(value = "MenuInfoService")
public class MenuInfoServiceImpl implements MenuInfoServiceI{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuInfoServiceImpl.class);
	@Autowired
	MenuInfoPoMapper menuInfoPoMapper;

	@Override
	public MenuInfoDto findAllMenu(MenuInfoDto dto) {
		MenuInfoDto mdto=new MenuInfoDto();
		MenuInfoPoCriteria example = new MenuInfoPoCriteria();
		MenuInfoPoCriteria.Criteria menuInfoCriteria = example.createCriteria();
		if (null != dto.getMenuName() && !"".equals(dto.getMenuName())) {
			menuInfoCriteria.andMenuNameLike("%"+dto.getMenuName()+"%");
		}
		String pagingStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, dto.getPageIndex(), dto.getLimit());
		example.setOrderByClause(pagingStr);
		try{
			int count = menuInfoPoMapper.countByExample(example);
			List<MenuInfoPo> po = menuInfoPoMapper.selectByExample(example);
			List<MenuInfoDto> menuInfoDto = BeanCopyUtils.populateTListbyDListBySpring(po,MenuInfoDto.class); 
			mdto.setRows(menuInfoDto);
			mdto.setResults(count);
		}catch(Exception e){
			LOGGER.error("查询错误",e);
		}
		return mdto;
	}

	@Override
	public List<MenuInfoDto> findTreeBy(int i) {
		MenuInfoPoCriteria example = new MenuInfoPoCriteria();
		MenuInfoPoCriteria.Criteria menuInfoCriteria = example.createCriteria();
		menuInfoCriteria.andMenuParentEqualTo(i);
		List<MenuInfoPo> po = menuInfoPoMapper.selectByExample(example);
		List<MenuInfoDto> menuInfoDto = BeanCopyUtils.populateTListbyDListBySpring(po,MenuInfoDto.class); 
		return menuInfoDto;
	}

	@Override
	public Integer countMenuByRoleId(Integer roleId, Integer menuId) {
		// TODO Auto-generated method stub
		return menuInfoPoMapper.countMenuByRoleId(roleId,menuId);
	}

	@Override
	public Integer delMenuByRoleId(Integer roleId) {
		return menuInfoPoMapper.delMenuByRoleId(roleId);
	}

	@Override
	public Integer addMenuByRoleId(Integer roleId, Integer menuId) {
		// TODO Auto-generated method stub
		return menuInfoPoMapper.addMenuByRoleId(roleId,menuId);
	}

}
