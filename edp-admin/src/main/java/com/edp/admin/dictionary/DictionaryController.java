package com.edp.admin.dictionary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.serviceI.dictionary.DictionaryServiceI;
import com.edp.serviceI.dto.DictionaryDto;
import com.google.gson.Gson;

/**
 * 数据辞典模块
 * @time 2016/4/26
 * @author zhang_cancan
 *
 */
@Controller
@RequestMapping("DictionaryController")
public class DictionaryController {
	
	@Autowired
	private DictionaryServiceI dictionaryServiceI; 
	private static final Logger LOGGER = LoggerFactory.getLogger(DictionaryController.class);
	private Gson gson = new Gson();
	
	/**
	 * 查询可添加的类型
	 * @time 2016/4/26
     * @author zhang_cancan
	 */
	@RequestMapping(value = "/findTypeById.action" , method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public String findTypeById(DictionaryDto dictionaryDto){
		DictionaryDto d=dictionaryServiceI.getAllDictionary(dictionaryDto);
		return gson.toJson(d);
	}

}
