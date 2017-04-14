package com.edp.service.reply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.ReplyInfoPo;
import com.edp.dao.mapper.ReplyInfoPoMapper;
import com.edp.serviceI.dto.ReplyInfoDto;
import com.edp.serviceI.reply.ReplyServiceI;



@Service(value = "ReplyServiceI")
public class ReplyServiceImpl implements ReplyServiceI{
    
	
	
	@Autowired
	private ReplyInfoPoMapper replyMapper;	
	/**
	 * zhang_cancan 2016/9/13
	 */
	@Override
	public Integer addReply(ReplyInfoDto dto) {
		ReplyInfoPo po = BeanCopyUtils.populateTbyDBySpring(dto , ReplyInfoPo.class);
		return replyMapper.insert(po);
	}

}
