package com.edp.service.mail;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.MailInfoPo;
import com.edp.dao.mapper.MailInfoPoMapper;
import com.edp.serviceI.dto.MailInfoDto;
import com.edp.serviceI.mail.MailInfoServiceI;

@Service("MailInfoServiceI")
public class MailInfoServiceImpl implements MailInfoServiceI{
	
	@Resource
	private MailInfoPoMapper mailMapper;

	@Override
	public List<MailInfoDto> getMailByUserId(String state, Integer id,Integer pageNow,Integer pageSize) {
		pageNow = ((pageNow-1)*pageSize);
		if("".equals(state) || state==null){
			state = "00,01";
		}
		List<MailInfoPo> po = mailMapper.getMailByUserId(state,id,pageNow,pageSize);
		return BeanCopyUtils.populateTListbyDListBySpring(po, MailInfoDto.class);
	}

	@Override
	public Integer editMail(MailInfoDto dto) {
		MailInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto, MailInfoPo.class);				
		return mailMapper.updateByPrimaryKeySelective(po);
	}

	@Override
	public MailInfoDto findMailById(Integer id) {
		MailInfoPo po = mailMapper.selectByPrimaryKey(id);
		return BeanCopyUtils.populateTbyDBySpring(po, MailInfoDto.class);	
	}

}
