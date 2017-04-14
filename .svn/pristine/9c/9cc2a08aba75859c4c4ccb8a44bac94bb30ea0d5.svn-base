package com.edp.service.functionInfo;


import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.FunctionInfoPo;
import com.edp.dao.domain.TreeInfoPo;
import com.edp.dao.mapper.FunctionInfoPoMapper;
import com.edp.dao.mapper.TreeInfoPoMapper;
import com.edp.serviceI.dto.FunctionInfoDto;
import com.edp.serviceI.functionInfo.FunctionInfoServiceI;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value = "functionInfoService")
public class FunctionInfoServiceImpl implements FunctionInfoServiceI {

    private static final Logger log = LoggerFactory.getLogger(FunctionInfoServiceImpl.class);
    @Autowired
    private FunctionInfoPoMapper functionInfoPoMapper;
	@Autowired
	private TreeInfoPoMapper treeMapper;
    
	@Override
	public Integer editFcuntion(FunctionInfoDto dto) {
		FunctionInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto,FunctionInfoPo.class);
		functionInfoPoMapper.updateByPrimaryKeySelective(po);
		TreeInfoPo tPo = new TreeInfoPo();
		tPo.setId(dto.getId());
		tPo.setTreeName(dto.getFunctionName());
		tPo.setTreeDesc(dto.getFuncitonDesc());
		return treeMapper.updateByPrimaryKeySelective(tPo);
	}

	@Override
	public Integer addFuncitonByScene(String functionId,String sceneId,String controlId) {
		treeMapper.delFuncitonByScene(sceneId,controlId);
		return treeMapper.addFuncitonByScene(functionId,sceneId,controlId);
	}
    

}
