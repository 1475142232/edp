package com.edp.service.logininfo;

import java.util.List;

import javax.annotation.Resource;



import org.springframework.stereotype.Service;

import com.edp.common.utils.BeanCopyUtils;
import com.edp.dao.domain.UserInfoPo;
import com.edp.dao.domain.UserInfoPoCriteria;
import com.edp.dao.mapper.UserInfoPoMapper;
import com.edp.serviceI.dto.LoginInfoDto;
import com.edp.serviceI.dto.UserDto;
import com.edp.serviceI.logininfo.LoginInfoServiceI;


@Service(value = "LoginInfoService")
public class LoginInfoServiceImpl implements LoginInfoServiceI {
//	private static final Logger LOGGER = LoggerFactory.getLogger(LoginInfoServiceImpl.class);
   
	@Resource
	private UserInfoPoMapper userInfoMapper;

	@Override
	public Boolean getLoginInfoById(LoginInfoDto dto) {
		try {
			UserInfoPoCriteria example = new UserInfoPoCriteria();
			UserInfoPoCriteria.Criteria loginInfoCriteria = example.createCriteria();
			if (null != dto.getUserName() && !"".equals(dto.getUserName())) {
				loginInfoCriteria.andUserNameEqualTo(dto.getUserName());
			} else {
				return false;
			}
			List<UserInfoPo> result = userInfoMapper.selectByExample(example);
			if (result.size() > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
//			LOGGER.info("未知错误", e.getMessage());
			return false;
		}
	}

	/**
	 * 登录验证
	 */
	@Override
	public UserDto LoginUser(LoginInfoDto LoginInfoDto) {
		UserInfoPoCriteria example = new UserInfoPoCriteria();
		UserInfoPoCriteria.Criteria loginInfoCriteria = example.createCriteria();
		if (null != LoginInfoDto.getUserName() && !"".equals(LoginInfoDto.getUserName())) {
			loginInfoCriteria.andUserNameEqualTo(LoginInfoDto.getUserName());
		}
		if (null != LoginInfoDto.getUserPwd() && !"".equals(LoginInfoDto.getUserPwd())) {
			loginInfoCriteria.andUserPasswordEqualTo(LoginInfoDto.getUserPwd());
		}
		List<UserInfoPo> po=userInfoMapper.selectByExample(example);
		if(po.size()!=0){
			return BeanCopyUtils.populateTbyDBySpring(po.get(0),UserDto.class);
		}else{
			return null;
		}

	}

}
