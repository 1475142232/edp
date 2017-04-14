package com.edp.service.problem;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.ProblemInfoPo;
import com.edp.dao.domain.ProblemInfoPoCriteria;
import com.edp.dao.domain.ReplyInfoPo;
import com.edp.dao.domain.ReplyInfoPoCriteria;
import com.edp.dao.mapper.ProblemInfoPoMapper;
import com.edp.dao.mapper.ReplyInfoPoMapper;
import com.edp.serviceI.dto.ProblemInfoDto;
import com.edp.serviceI.dto.ReplyInfoDto;
import com.edp.serviceI.problem.ProblemServiceI;

@Service(value = "ProblemServiceI")
public class ProblemServiceImpl implements ProblemServiceI{
	
	private static final Logger log = LoggerFactory.getLogger(ProblemServiceImpl.class);
	
	@Autowired
	private ProblemInfoPoMapper problemMapper;
	@Autowired
	private ReplyInfoPoMapper replyMapper;

	@Override
	public List<ProblemInfoDto> findProblem(ProblemInfoDto dto) {
		ProblemInfoPoCriteria example = new ProblemInfoPoCriteria();
		ProblemInfoPoCriteria.Criteria Crteria = example.createCriteria();
		Crteria.andProductIdEqualTo(dto.getProductId());
		if(dto.getProblemStarteUser()!= null && !"".equals(dto.getProblemStarteUser())){
			Crteria.andProblemStarteUserEqualTo(dto.getProblemStarteUser());
		}
		if(dto.getProblemEndUser()!= null && !"".equals(dto.getProblemEndUser())){
			Crteria.andProblemEndUserEqualTo(dto.getProblemEndUser());
		}
		if(dto.getProblemLv() != null && !"".equals(dto.getProblemLv())){
			Crteria.andProblemLvEqualTo(dto.getProblemLv());
		}
        if(dto.getProblemType() != null && !"".equals(dto.getProblemType())){
        	Crteria.andProblemTypeEqualTo(dto.getProblemType());
        }
        if(dto.getProblemName() !=null && !"".equals(dto.getProblemName())){
        	Crteria.andProblemNameLike("%" +dto.getProblemName() +"%" );
        }
        List<ProblemInfoPo> po = problemMapper.selectByExample(example);
        return BeanCopyUtils.populateTListbyDListBySpring(po,ProblemInfoDto.class);
	}

	@Override
	public ProblemInfoDto findProblemById(Integer problemId) {
		ProblemInfoPo po = problemMapper.selectByPrimaryKey(problemId);
		ProblemInfoDto dto = BeanCopyUtils.populateTbyDBySpring(po , ProblemInfoDto.class);
		ReplyInfoPoCriteria example = new ReplyInfoPoCriteria();
		ReplyInfoPoCriteria.Criteria Crteria = example.createCriteria(); 
		Crteria.andProblemIdEqualTo(problemId);
		List<ReplyInfoPo> reply = replyMapper.selectByExample(example);
		List<ReplyInfoDto> replyDto = BeanCopyUtils.populateTListbyDListBySpring(reply,ReplyInfoDto.class);
	    dto.setChildren(replyDto);
		return dto;
	}

	@Override
	public Integer editProblem(ProblemInfoDto dto) {
		ProblemInfoPo po = BeanCopyUtils.populateTbyDBySpring( dto , ProblemInfoPo.class);
		return problemMapper.updateByPrimaryKeySelective(po);
	}

	@Override
	public Integer addProblem(ProblemInfoDto dto) {
		ProblemInfoPo po = BeanCopyUtils.populateTbyDBySpring( dto , ProblemInfoPo.class);
		return problemMapper.insert(po);
	}

}
