package com.edp.service.stencil;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.StencilTreePo;
import com.edp.dao.domain.StencilTreePoCriteria;
import com.edp.dao.domain.TableColunmPo;
import com.edp.dao.mapper.StencilTreePoMapper;
import com.edp.serviceI.dto.CtableDto;
import com.edp.serviceI.dto.StencilDto;
import com.edp.serviceI.dto.TreeDto;
import com.edp.serviceI.stencil.StencilServiceI;

@Service(value ="StencilService")
public class StencilServiceImpl implements StencilServiceI{
    
	
	@Resource
	private StencilTreePoMapper stencilTreePoMapper;
	
	
	
	@Override
	public StencilDto findTreeById(String id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		StencilTreePo sp=stencilTreePoMapper.selectByPrimaryKey(id);
		StencilDto sd=BeanCopyUtils.populateTbyDBySpring(sp,StencilDto.class);
		return findTree(sd);
	}
    
	private StencilDto findTree(StencilDto sp){
		StencilTreePoCriteria stencilTreePoCriteria=new StencilTreePoCriteria();
		StencilTreePoCriteria.Criteria sc=stencilTreePoCriteria.createCriteria();
		sc.andTreeNodeParentEqualTo(sp.getId());
		List<StencilTreePo> s=stencilTreePoMapper.selectByExample(stencilTreePoCriteria);
		List<StencilDto> sd=BeanCopyUtils.populateTListbyDListBySpring(s,StencilDto.class);
		if(sd.size()!=0){
			sp.setChildren(sd);
			for(int i=0;i<sd.size();i++){
				sd.set(i, findTree(sd.get(i)));
			}
		}
	    return sp;
	}
    

	@Override
	public List<TreeDto> findAllStencil() {
		StencilTreePoCriteria stencilTreePoCriteria=new StencilTreePoCriteria();
		StencilTreePoCriteria.Criteria sc=stencilTreePoCriteria.createCriteria();
		sc.andTreeNodeTypeEqualTo("0");
		List<StencilTreePo> sp=stencilTreePoMapper.selectByExample(stencilTreePoCriteria);
		List<TreeDto> trees=BeanCopyUtils.populateTListbyDListBySpring(sp,TreeDto.class);
		return trees;
	}

	@Override
	public Integer findCountById(String pId, String id) {
		return stencilTreePoMapper.findCountById(pId,id);
	}

	@Override
	public String findtreeNodeParentById(String pId, String treeNodeParent) {
		return stencilTreePoMapper.findtreeNodeParentById(pId,treeNodeParent);
	}

	@Override
	public void addTreeNode(String pId, String id, String newId) {
		stencilTreePoMapper.addTreeNode(pId,id,newId);
		
	}

	@Override
	public List<CtableDto> findTableById(String control_id, String funId) {
		List<TableColunmPo> po=stencilTreePoMapper.findTableById(control_id,funId);
		List<CtableDto> trees=BeanCopyUtils.populateTListbyDListBySpring(po,CtableDto.class);
		return trees;
	}


	@Override
	public List<CtableDto> findColumnById(String control_id, String id) {
		List<TableColunmPo> po=stencilTreePoMapper.findColumnById(control_id,id);
		List<CtableDto> trees=BeanCopyUtils.populateTListbyDListBySpring(po,CtableDto.class);
		return trees;
	}

	@Override
	public void delStencilByProduct(String proId) {
		stencilTreePoMapper.delStencilByProduct(proId);
		
	}

	@Override
	public void delStencilById(String id, String treeNodeId) {
		stencilTreePoMapper.delStencilById(id,treeNodeId);
		
	}

}
