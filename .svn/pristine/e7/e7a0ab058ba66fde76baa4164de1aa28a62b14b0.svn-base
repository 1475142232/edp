package com.edp.service.columnRuleRef;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.ColumnRuleRefPo;
import com.edp.dao.domain.ColumnRuleRefPoCriteria;
import com.edp.dao.mapper.ColumnRuleRefPoMapper;
import com.edp.serviceI.columnRuleRef.ColumnRuleRefServiceI;
import com.edp.serviceI.dto.ColumnRuleRefDto;

@Service(value = "ColumnRuleRefService")
public class ColumnRuleRefServiceImpl implements ColumnRuleRefServiceI {

	private static final Logger LOGGER = LoggerFactory.getLogger(ColumnRuleRefServiceImpl.class);
	@Autowired
	private ColumnRuleRefPoMapper columnRuleRefPoMapper;

	@Override
	public ColumnRuleRefDto getAllColumnRuleRef(ColumnRuleRefDto dto) {

		ColumnRuleRefPoCriteria example = new ColumnRuleRefPoCriteria();
		ColumnRuleRefPoCriteria.Criteria columnRuleRefCriteria = example.createCriteria();

		if(null != dto.getId() && !"".equals(dto.getId())){
			columnRuleRefCriteria.andIdEqualTo(dto.getId());
		}
		if(null != dto.getRuleId() && !"".equals(dto.getRuleId())){
			columnRuleRefCriteria.andRuleIdEqualTo(dto.getRuleId());
		}
		if(null != dto.getColumnId() && !"".equals(dto.getColumnId())){
			columnRuleRefCriteria.andColumnIdEqualTo(dto.getColumnId());
		}
		if(null != dto.getRuleValue() && !"".equals(dto.getRuleId())){
			columnRuleRefCriteria.andRuleValueEqualTo(dto.getRuleValue());
		}

		String papingStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, dto.getPageIndex(), dto.getLimit());
		example.setOrderByClause(papingStr);

		try{
			int count = columnRuleRefPoMapper.countByExample(example);
			List<ColumnRuleRefPo> result = columnRuleRefPoMapper.selectByExample(example);
			List<ColumnRuleRefDto> result1 = BeanCopyUtils.populateTListbyDListBySpring(result, ColumnRuleRefDto.class);
			ColumnRuleRefDto returnDto = new ColumnRuleRefDto();
			returnDto.setRows(result1);
			returnDto.setResults(count);
			return returnDto;

		}catch(Exception e){
			LOGGER.error("赵宏志报错了");
		}

		return null;
	}

	@Override
	public ColumnRuleRefDto getColumnRuleRefDtoById(Integer id) {
		try{
			ColumnRuleRefPo po = columnRuleRefPoMapper.selectByPrimaryKey(id);
			return BeanCopyUtils.populateTbyDBySpring(po, ColumnRuleRefDto.class);
		}catch(Exception e){
			LOGGER.error("根据ID查询失败");
		}
		return null;

	}

	@Override
	public void updateColumnRuleRef(ColumnRuleRefDto dto) {
		ColumnRuleRefPo po = BeanCopyUtils.populateTbyDBySpring(dto, ColumnRuleRefPo.class);
		columnRuleRefPoMapper.updateByPrimaryKeySelective(po);
		
	}

	@Override
	public void addColumnRuleRef(ColumnRuleRefDto dto) {
		ColumnRuleRefPo po = BeanCopyUtils.populateTbyDBySpring(dto, ColumnRuleRefPo.class);
		columnRuleRefPoMapper.insert(po);
		
	}

	@Override
	public void delColumnRuleRef(Integer id) {
		columnRuleRefPoMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public void delColumnRuleRefByColumnId(ColumnRuleRefDto dto) {
		ColumnRuleRefPoCriteria example = new ColumnRuleRefPoCriteria();
		ColumnRuleRefPoCriteria.Criteria columnRuleRefCriteria = example.createCriteria();
		columnRuleRefCriteria.andColumnIdEqualTo(dto.getColumnId());
		columnRuleRefPoMapper.deleteByExample(example);
	}

}
