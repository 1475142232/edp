package com.edp.serviceI.product;


import java.util.List;

import com.edp.serviceI.dto.ProductDto;
import com.edp.serviceI.dto.UserInfoDto;

public interface ProductServiceI {
	
	List<ProductDto> getAllProduct(String teamId, Integer id);

	Integer addProduct(ProductDto productDto);

	String addUTPId(String teamId, Integer id, ProductDto productDto,Integer role_type);

	Integer editProductById(ProductDto productDto);

	ProductDto findProductById(String productId);

	Integer delUserIdByProductId(String id);

}