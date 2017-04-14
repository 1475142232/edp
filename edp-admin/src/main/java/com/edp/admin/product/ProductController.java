package com.edp.admin.product;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.admin.common.BaseController;
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.ProductDto;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.fence.FenceInfoServiceI;
import com.edp.serviceI.product.ProductServiceI;
import com.edp.serviceI.tree.TreeServiceI;
import com.edp.serviceI.user.UserServiceI;
import com.google.gson.Gson;



/**
 * 
 * @author wu_jianxing
 * 
 * 时间：2016.4.18
 *
 */

@Controller
@RequestMapping("productController")
public class ProductController  extends BaseController{
	
	@Autowired
	private ProductServiceI productService;
	@Autowired
	private FenceInfoServiceI fenceService;
	@Autowired
	private TreeServiceI treeService;
	@Autowired
	private UserServiceI userServiceI;
	
	
private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	private Gson gson = new Gson();
	
	@RequestMapping(value = "/productList.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String getAllProduct(String teamId, HttpSession session){
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		userDto.setUserRole(userServiceI.findRoleById(teamId,userDto.getId()));
		List<ProductDto> productDto=productService.getAllProduct(teamId,userDto.getId());
		return gson.toJson(productDto);
	}
	
	@RequestMapping(value = "/addProduct.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String addProduct(String teamId, ProductDto productDto, String userIds,HttpSession session){
		productDto.setProductState("01");
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		productDto.setId(SequenceManage.getSequence(""));
		productDto.setProductOwner(userDto.getId()+"");
		productDto.setProductCreater(userDto.getUserName());
		productDto.setProductCreatetime(sdf.format(today));
		productService.addProduct(productDto);
		String productId = productService.addUTPId(teamId,userDto.getId(),productDto,1);
		if(!"".equals(userIds) && userIds!=null){
		    String[] userId = userIds.split(",");
		    for( int i = 0 ; i<userId.length ; i++){
		         productId = productService.addUTPId(teamId,Integer.parseInt(userId[i]),productDto,2);			
		    }
		}
		fenceService.addFencBase(productId);
		treeService.addProductTree(productDto);
		return gson.toJson("0000");
	}
	
	@RequestMapping(value = "/editProductById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String editProductById(String teamId, ProductDto productDto, String userIds , HttpSession session){
		Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		UserInfoDto userDto=(UserInfoDto)session.getAttribute("user");
		productDto.setProductModifiedperson(userDto.getUserName());
		productDto.setProductModifiedtime(sdf.format(today));
		productService.editProductById(productDto);
		if(!productDto.getProductState().equals("00")){
	    	productDto = productService.findProductById(productDto.getId());
		    productService.delUserIdByProductId(productDto.getId());		
			String[] userId;
		    userId = userIds.split(",");
		    List<String> userList = new ArrayList<String>();
		    for(int i=0 ; i<userId.length ; i++){
		    	userList.add(userId[i]);
		    }
		    userList.add(productDto.getProductOwner());
		    for( int i = 0 ; i<userList.size() ; i++){
		         productService.addUTPId(teamId,Integer.parseInt(userList.get(i)),productDto,2);			
		    }
		}
		return gson.toJson("0000");
	}
	
	@RequestMapping(value = "/findProductById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findProductById(String productId){
		ProductDto dto=productService.findProductById(productId);
		return gson.toJson(dto);
	}
}
