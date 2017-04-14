package com.edp.service.moduleinfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.ModuleInfoPo;
import com.edp.dao.domain.ModuleInfoPoCriteria;
import com.edp.dao.mapper.ModuleInfoPoMapper;
import com.edp.service.product.ProductServiceImpl;
import com.edp.serviceI.dto.ModuleInfoDto;
import com.edp.serviceI.moduleinfo.ModuleInfoServiceI;

/**
 * 
 * @author wu_jianxing(吴建行)
 * 时间：2016.4.21
 *
 */
@Service("moduleServiceI")
public class ModuleInfoServiceImpl implements ModuleInfoServiceI {
	private static final Logger LOGGER = LoggerFactory.getLogger(ModuleInfoServiceImpl.class);
	@Autowired
	private ModuleInfoPoMapper moduleInfoMapper;

	public ModuleInfoDto getAllModules(ModuleInfoDto dto) {

		ModuleInfoPoCriteria example = new ModuleInfoPoCriteria();
		ModuleInfoPoCriteria.Criteria moduleCriteria = example.createCriteria();
		if (null != dto.getId() && !"".equals(dto.getId())) {
			moduleCriteria.andIdEqualTo(dto.getId());
		}
		if (null != dto.getModuleName() && !"".equals(dto.getModuleName())) {
			moduleCriteria.andModuleNameLike("%"+dto.getModuleName()+"%");
		}
		String pagingStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC,
				dto.getPageIndex(), dto.getLimit());
		example.setOrderByClause(pagingStr);
		try {
			int count = moduleInfoMapper.countByExample(example);
			List<ModuleInfoPo> result = moduleInfoMapper.selectByExample(example);
			List<ModuleInfoDto> returnVal = BeanCopyUtils.populateTListbyDListBySpring(result, ModuleInfoDto.class);
			ModuleInfoDto returnDto = new ModuleInfoDto();
			returnDto.setRows(returnVal);
			returnDto.setResults(count);
			return returnDto;
		} catch (Exception e) {
			LOGGER.error("查询全部产品错误！", e);
		}
		return null;
	}

	// 根据id获得模块
	public ModuleInfoDto getModuleById(String proId) {
		try {
			ModuleInfoPo result = moduleInfoMapper.selectByPrimaryKey(proId);
			return BeanCopyUtils.populateTbyDBySpring(result, ModuleInfoDto.class);
		} catch (Exception e) {
			LOGGER.error("根据用户id查询全部用户错误！", e);
		}
		return null;
	}

	// 添加功能
	public void addModule(ModuleInfoDto dto) {
		ModuleInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto, ModuleInfoPo.class);
		moduleInfoMapper.insertSelective(po);
	}

	// 修改功能
	public void updateModule(ModuleInfoDto dto) {
				ModuleInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto, ModuleInfoPo.class);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    	String format = sdf.format(new Date());
				po.setModuleModifiedTime(format);
				po.setModuleModifiedPerson("xiaomi");
				moduleInfoMapper.updateByPrimaryKeySelective(po);
		}

	// 删除功能
	public void delModule(String proId) {
		moduleInfoMapper.deleteByPrimaryKey(proId);
	}

}
