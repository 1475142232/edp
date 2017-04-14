package com.edp.service.ruleinfo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SqlFormatUtil;
import com.edp.dao.domain.RuleInfoPo;
import com.edp.dao.domain.RuleInfoPoCriteria;
import com.edp.dao.mapper.RuleInfoPoMapper;
import com.edp.service.moduleinfo.ModuleInfoServiceImpl;
import com.edp.serviceI.dto.RuleInfoDto;
import com.edp.serviceI.ruleinfo.RuleInfoServiceI;
/**
 * 
 * @author wu_jianxing(吴建行)
 * 时间：2016.4.25
 */
@Service("ruleServiceI")
public class RuleInfoServiceImpl implements RuleInfoServiceI {
	private static final Logger LOGGER = LoggerFactory.getLogger(ModuleInfoServiceImpl.class);
	@Autowired
	private RuleInfoPoMapper ruleInfoPoMapper;
	public RuleInfoDto getAllRules(RuleInfoDto dto) {
		RuleInfoPoCriteria example = new RuleInfoPoCriteria();
		RuleInfoPoCriteria.Criteria ruleCriteria = example.createCriteria();
		if (null != dto.getId() && !"".equals(dto.getId())) {
			ruleCriteria.andIdEqualTo(dto.getId());
		}
		if (null != dto.getRuleName() && !"".equals(dto.getRuleName())) {
			ruleCriteria.andRuleNameLike("%"+dto.getRuleName()+"%");
		}
		String pagingStr = SqlFormatUtil.makeupOrderByAndLimit("id", SqlFormatUtil.ORDER_BY_DIRECTION_DESC,
				dto.getPageIndex(), dto.getLimit());
		example.setOrderByClause(pagingStr);
		try {
			int count = ruleInfoPoMapper.countByExample(example);
			List<RuleInfoPo> result = ruleInfoPoMapper.selectByExample(example);
			List<RuleInfoDto> returnVal = BeanCopyUtils.populateTListbyDListBySpring(result, RuleInfoDto.class);
			RuleInfoDto returnDto = new RuleInfoDto();
			returnDto.setRows(returnVal);
			returnDto.setResults(count);
			return returnDto;
		} catch (Exception e) {
			LOGGER.error("查询全部产品错误！", e);
		}
		return null;
	}

	public RuleInfoDto getRuleById(String Id) {
		try {
			RuleInfoPo result = ruleInfoPoMapper.selectByPrimaryKey(Id);
			return BeanCopyUtils.populateTbyDBySpring(result, RuleInfoDto.class);
		} catch (Exception e) {
			LOGGER.error("根据用户id查询表错误！", e);
		}
		return null;
	}

	public void addRule(RuleInfoDto dto) {
		RuleInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto, RuleInfoPo.class);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String format = sdf.format(new Date());
    	po.setRuleCreateTime(format);
    	ruleInfoPoMapper.insertSelective(po);
	}

	public void updateRule(RuleInfoDto dto) {
		RuleInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto, RuleInfoPo.class);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String format = sdf.format(new Date());
    	po.setRuleCreateTime(format);
//    	po.setRuleCreater(null);
		ruleInfoPoMapper.updateByPrimaryKeySelective(po);
	}
	// 删除表功能
	public void delRule(String Id) {
		ruleInfoPoMapper.deleteByPrimaryKey(Id);
	}

	@Override
	public List<RuleInfoDto> findRuleByProduceId(String ruleProduct) {
		List<RuleInfoPo> rid=ruleInfoPoMapper.findRuleByProduceId(ruleProduct);
		List<RuleInfoDto> returnVal = BeanCopyUtils.populateTListbyDListBySpring(rid, RuleInfoDto.class);
		return returnVal;
	}
}
