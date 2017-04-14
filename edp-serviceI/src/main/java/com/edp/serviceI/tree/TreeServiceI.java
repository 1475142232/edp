package com.edp.serviceI.tree;


import java.util.List;

import com.edp.serviceI.dto.ProductDto;
import com.edp.serviceI.dto.TreeInfoDto;

public interface TreeServiceI {


	TreeInfoDto findTreeById(String productId);
	
	Integer addTreeNode(TreeInfoDto dto);
	
	Integer editTreeNode(TreeInfoDto dto);

	Integer addProductTree(ProductDto productDto);

	List<TreeInfoDto> findTreeByType(String productId,String type);

	List<TreeInfoDto> findParentByproductId(String productId);

	List<TreeInfoDto> findTreeNodeByPid(String id);

	TreeInfoDto findTreeNodeById(String id);

	Integer addFunctionByTree(TreeInfoDto dto);

	Integer editTreeState(List<String> ids);


}
