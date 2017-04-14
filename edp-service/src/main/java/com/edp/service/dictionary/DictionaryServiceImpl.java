package com.edp.service.dictionary;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.DictionaryInfoPo;
import com.edp.dao.domain.DictionaryInfoPoCriteria;
import com.edp.dao.domain.TableInfoPo;
import com.edp.dao.mapper.DictionaryInfoPoMapper;
import com.edp.service.tableinfo.TableInfoServiceImpl;
import com.edp.serviceI.dictionary.DictionaryServiceI;
import com.edp.serviceI.dto.DictionaryDto;
import com.edp.serviceI.dto.TableInfoDto;
@Service("dictionaryServiceI")
@Transactional
public class DictionaryServiceImpl implements DictionaryServiceI{
	private static final Logger LOGGER = LoggerFactory.getLogger(TableInfoServiceImpl.class);
	@Autowired
private DictionaryInfoPoMapper dictionaryInfoPoMapper;
	public DictionaryInfoPoMapper getDictionaryInfoPoMapper() {
		return dictionaryInfoPoMapper;
	}

	public void setDictionaryInfoPoMapper(DictionaryInfoPoMapper dictionaryInfoPoMapper) {
		this.dictionaryInfoPoMapper = dictionaryInfoPoMapper;
	}

	@Override
	public void addDictionary(DictionaryDto dto) {
		// TODO Auto-generated method stub
		DictionaryInfoPo po=BeanCopyUtils.populateTbyDBySpring(dto, DictionaryInfoPo.class);
		dictionaryInfoPoMapper.insertSelective(po);
	}

	@Override
	public void deleteDictionary(int id) {
		// TODO Auto-generated method stub
		dictionaryInfoPoMapper.deleteById(id);
	}

	@Override
	public DictionaryDto updateDictionary(DictionaryDto dto) {
		// TODO Auto-generated method stub
		DictionaryInfoPo po=BeanCopyUtils.populateTbyDBySpring(dto, DictionaryInfoPo.class);
	//	int id=po.getId();
		int result=dictionaryInfoPoMapper.updateByPrimaryKeySelective(po);
		return dto;
	}

	@Override
	public List<DictionaryDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DictionaryDto getAllDictionary(DictionaryDto dto) {
		// TODO Auto-generated method stub
		DictionaryInfoPoCriteria example = new DictionaryInfoPoCriteria();
		String pagingStr = SqlFormatUtil.makeupOrderByAndLimit("d_type", SqlFormatUtil.ORDER_BY_DIRECTION_DESC, dto.getPageIndex(), dto.getLimit());
		example.setOrderByClause(pagingStr);
		try{
			int count = dictionaryInfoPoMapper.countByExample(example);
			List<DictionaryInfoPo> result = dictionaryInfoPoMapper.selectByExample(example);
			List<DictionaryDto> result1 = BeanCopyUtils.populateTListbyDListBySpring(result, DictionaryDto.class);
			DictionaryDto returnDto = new DictionaryDto();
			returnDto.setRows(result1);
			returnDto.setResults(count);
            return returnDto;
		}catch(Exception e){
			LOGGER.error("查询错误");
		}
		return null;
	}

	@Override
	public DictionaryDto findDictionaryDtoById(int id) {
		// TODO Auto-generated method stub
		try{
			DictionaryInfoPo result = dictionaryInfoPoMapper.selectByPrimaryKey(id);
			return BeanCopyUtils.populateTbyDBySpring(result, DictionaryDto.class);
		}catch(Exception e){
			LOGGER.error("根据用户id查询全部用户错误！",e);
		}
		return null;
	};

	@Override
	public DictionaryDto selectDictionaryById(int id) {
		// TODO Auto-generated method stub
		try{
			DictionaryInfoPo result = dictionaryInfoPoMapper.selectByPrimaryKey(id);
			return BeanCopyUtils.populateTbyDBySpring(result,  DictionaryDto.class);
		}catch(Exception e){
			LOGGER.error("根据用户id查询全部用户错误！",e);
		}
		return null;
	}

}
