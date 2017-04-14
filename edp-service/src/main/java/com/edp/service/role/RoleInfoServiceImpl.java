package com.edp.service.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.RoleInfoPo;
import com.edp.dao.domain.RoleInfoPoCriteria;
import com.edp.dao.mapper.RoleInfoPoMapper;
import com.edp.serviceI.dto.RoleDto;
import com.edp.serviceI.role.RoleInfoServiceI;

@Service("RoleInfoService")
public class RoleInfoServiceImpl implements RoleInfoServiceI{
	
	@Autowired
	private RoleInfoPoMapper roleInfoPoMapper;

	@Override
	public List<RoleDto> findRoleByDeptId(String userDept) {
		RoleInfoPoCriteria example = new RoleInfoPoCriteria();
		RoleInfoPoCriteria.Criteria roleCriteria = example.createCriteria();
		roleCriteria.andRoleDeptEqualTo(userDept);
		List<RoleInfoPo> po = roleInfoPoMapper.selectByExample(example);
		List<RoleDto> dto = BeanCopyUtils.populateTListbyDListBySpring(po,RoleDto.class);
		return dto;
	}

	@Override
	public void addRoleInfo(RoleDto dto) {
		RoleInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto,RoleInfoPo.class);
		roleInfoPoMapper.insert(po);
	}

	@Override
	public Integer delRoleInfo(Integer id) {
		Integer res=roleInfoPoMapper.deleteByPrimaryKey(id);
		return res;
	}

	@Override
	public Integer delUserInfo(Integer id) {
		Integer count=roleInfoPoMapper.deleteByUserId(id);
		return count;
	}

	@Override
	public Integer addUserInfo(Integer id, Integer parseInt) {
		return roleInfoPoMapper.addUserInfo(id,parseInt);
	}

	@Override
	public List<Integer> findRoleByUserId(Integer id) {
		return roleInfoPoMapper.findRoleByUserId(id);
	}

	@Override
	public List<String> findRoleTypeByUserId(Integer id) {
		return roleInfoPoMapper.findRoleTypeByUserId(id);
	}

}
