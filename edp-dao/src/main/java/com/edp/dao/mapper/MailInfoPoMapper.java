package com.edp.dao.mapper;

import com.edp.dao.domain.MailInfoPo;
import com.edp.dao.domain.MailInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailInfoPoMapper {
    int countByExample(MailInfoPoCriteria example);

    int deleteByExample(MailInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MailInfoPo record);

    int insertSelective(MailInfoPo record);

    List<MailInfoPo> selectByExample(MailInfoPoCriteria example);

    MailInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MailInfoPo record, @Param("example") MailInfoPoCriteria example);

    int updateByExample(@Param("record") MailInfoPo record, @Param("example") MailInfoPoCriteria example);

    int updateByPrimaryKeySelective(MailInfoPo record);

    int updateByPrimaryKey(MailInfoPo record);

	List<MailInfoPo> getMailByUserId(@Param("mail_state")String state, @Param("user_id")Integer id, @Param("pageNow")Integer pageNow, @Param("pageSize")Integer pageSize);
}