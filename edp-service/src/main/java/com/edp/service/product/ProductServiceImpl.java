package com.edp.service.product;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.*;
import com.edp.dao.mapper.*;
import com.edp.serviceI.dto.ProductDto;
import com.edp.serviceI.dto.TaskInfoDto;
import com.edp.serviceI.product.ProductServiceI;

import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 * @author wu_jianixing
 * @时间：2016.4.14
 */
@Service("productServiceI")
@Transactional
public class ProductServiceImpl implements ProductServiceI {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);
    @Autowired
    private ProductInfoPoMapper productInfoPoMapper;
    
	@Override
	public List<ProductDto> getAllProduct(String teamId, Integer id) {
		List<ProductInfoPo> po = productInfoPoMapper.getAllProduct(teamId,id);	
		return BeanCopyUtils.populateTListbyDListBySpring(po, ProductDto.class);
	}

	@Override
	public Integer addProduct(ProductDto productDto) {
		ProductInfoPo po = BeanCopyUtils.populateTbyDBySpring(productDto,ProductInfoPo.class);
		return productInfoPoMapper.insert(po);
	}

	@Override
	public String addUTPId(String teamId, Integer userId, ProductDto productDto,Integer role_type) {
		ProductInfoPoCriteria example = new ProductInfoPoCriteria();
		ProductInfoPoCriteria.Criteria productCrteria = example.createCriteria();
		productCrteria.andProductCreaterEqualTo(productDto.getProductCreater());
		productCrteria.andProductCreatetimeEqualTo(productDto.getProductCreatetime());
		List<ProductInfoPo> po = productInfoPoMapper.selectByExample(example);
		productInfoPoMapper.addUTPId(userId,teamId,po.get(0).getId(),role_type);
		return po.get(0).getId();
	}

	@Override
	public Integer editProductById(ProductDto productDto) {
		ProductInfoPo po = BeanCopyUtils.populateTbyDBySpring(productDto,ProductInfoPo.class);
		return productInfoPoMapper.updateByPrimaryKeySelective(po);
	}

	@Override
	public ProductDto findProductById(String productId) {
		ProductInfoPo po = productInfoPoMapper.selectByPrimaryKey(productId);
		return BeanCopyUtils.populateTbyDBySpring(po,ProductDto.class);
	}

	@Override
	public Integer delUserIdByProductId(String id) {
		return productInfoPoMapper.delUserIdByProductId(id);
	}


}
      