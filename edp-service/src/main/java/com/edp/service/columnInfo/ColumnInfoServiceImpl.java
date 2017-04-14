package com.edp.service.columnInfo;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.ColumnInfoPo;
import com.edp.dao.domain.ColumnInfoPoCriteria;
import com.edp.dao.mapper.ColumnInfoPoMapper;
import com.edp.serviceI.columnInfo.ColumnInfoServiceI;
import com.edp.serviceI.dto.ColumnInfoDto;

@Service(value = "ColumnInfoService")
public class ColumnInfoServiceImpl implements ColumnInfoServiceI {

	private static final Logger LOGGER = LoggerFactory.getLogger(ColumnInfoServiceImpl.class);
	@Autowired
	private ColumnInfoPoMapper columnInfoPoMapper;
	@Override
	public ColumnInfoDto getColumnList(ColumnInfoDto dto) {
		ColumnInfoPoCriteria example = new ColumnInfoPoCriteria();
		ColumnInfoPoCriteria.Criteria tableCriteria = example.createCriteria();
		tableCriteria.andTableIdEqualTo(dto.getTableId());
		tableCriteria.andColumnStateEqualTo("01");
		List<ColumnInfoPo> po = columnInfoPoMapper.selectByExample(example);
		Integer count = columnInfoPoMapper.countByExample(example);
		dto=new ColumnInfoDto();
		dto.setData(BeanCopyUtils.populateTListbyDListBySpring(po, ColumnInfoDto.class));
		dto.setTotal(count);
		return dto;
	}
	@Override
	public Integer addColumn(ColumnInfoDto dto) {
		ColumnInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto, ColumnInfoPo.class);
		return columnInfoPoMapper.insert(po);
	}
	
	
	@Override
	public Integer editColumn(ColumnInfoDto dto) {
		ColumnInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto, ColumnInfoPo.class);
		return columnInfoPoMapper.updateByPrimaryKeySelective(po);
	}
	@Override
	public ColumnInfoDto findColumnById(ColumnInfoDto dto) {
		ColumnInfoPo po = columnInfoPoMapper.selectByPrimaryKey(dto.getId());
		return BeanCopyUtils.populateTbyDBySpring(po, ColumnInfoDto.class);
	}
	

}
