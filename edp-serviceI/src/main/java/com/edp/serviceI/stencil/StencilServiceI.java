package com.edp.serviceI.stencil;

import java.util.List;

import com.edp.serviceI.dto.CtableDto;
import com.edp.serviceI.dto.StencilDto;
import com.edp.serviceI.dto.TreeDto;

public interface StencilServiceI {

	StencilDto findTreeById(String id);

	List<TreeDto> findAllStencil();

	Integer findCountById(String pId, String id);

	String findtreeNodeParentById(String pId, String treeNodeParent);

	void addTreeNode(String pId, String id, String newId);

	List<CtableDto> findTableById(String control_id, String funId);

	List<CtableDto> findColumnById(String control_id, String id);

	void delStencilByProduct(String proId);

	void delStencilById(String id, String treeNodeId);


}
