package com.edp.service.tableinfo;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.TableInfoPo;
import com.edp.dao.domain.TableInfoPoCriteria;
import com.edp.dao.mapper.TableInfoPoMapper;
import com.edp.service.moduleinfo.ModuleInfoServiceImpl;
import com.edp.serviceI.dto.TableInfoDto;
import com.edp.serviceI.tableinfo.TableInfoServiceI;
/**
 * 
 * @author wu_jianxing(吴建行)
 * 时间：2016.4.22
 */
@Service("tableServiceI")
public class TableInfoServiceImpl implements TableInfoServiceI {
	private static final Logger LOGGER = LoggerFactory.getLogger(ModuleInfoServiceImpl.class);
	@Autowired
	private TableInfoPoMapper tableInfoPoMapper;
	
	/**
	 * zhang_cancan 2016/9/7
	 */
	public List<TableInfoDto> getAllTables(TableInfoDto dto) {
		TableInfoPoCriteria example = new TableInfoPoCriteria();
		TableInfoPoCriteria.Criteria tableCriteria = example.createCriteria();
		tableCriteria.andDataIdEqualTo(dto.getDataId());
		tableCriteria.andTableStateEqualTo("01");
		List<TableInfoPo> po = tableInfoPoMapper.selectByExample(example);
		return BeanCopyUtils.populateTListbyDListBySpring(po, TableInfoDto.class);
	}

	@Override
	public Integer addTable(TableInfoDto dto) {
		TableInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto,TableInfoPo.class);
		return tableInfoPoMapper.insert(po);
	}

	@Override
	public Integer editTable(TableInfoDto dto) {
		TableInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto,TableInfoPo.class);
		return tableInfoPoMapper.updateByPrimaryKeySelective(po);
	}

	@Override
	public TableInfoDto findTableById(TableInfoDto dto) {
		TableInfoPo po = tableInfoPoMapper.selectByPrimaryKey(dto.getId());
		return BeanCopyUtils.populateTbyDBySpring(po,TableInfoDto.class);
	}


	
}
