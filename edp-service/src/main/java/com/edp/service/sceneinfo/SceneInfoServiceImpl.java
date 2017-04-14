package com.edp.service.sceneinfo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.FunConTrolPo;
import com.edp.dao.domain.FunConTrolPoCriteria;
import com.edp.dao.domain.SceneInfoPo;
import com.edp.dao.domain.SceneInfoPoCriteria;
import com.edp.dao.mapper.FunConTrolPoMapper;
import com.edp.dao.mapper.SceneInfoPoMapper;
import com.edp.serviceI.dto.FunConTrolDto;
import com.edp.serviceI.dto.SceneInfoDto;
import com.edp.serviceI.sceneinfo.SceneInfoServiceI;
/**
 * 
 * @author wu_jianxing(吴建行)
 * 时间：2016.4.26
 */
@Service("sceneServiceI")
public class SceneInfoServiceImpl implements SceneInfoServiceI {
	private static final Logger LOGGER = LoggerFactory.getLogger(SceneInfoServiceImpl.class);
	@Autowired
	private SceneInfoPoMapper sceneInfoPoMapper;

	
	public SceneInfoDto getAllScenes(SceneInfoDto dto) {
		return null;
	}


	@Override
	public SceneInfoDto getSceneById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
