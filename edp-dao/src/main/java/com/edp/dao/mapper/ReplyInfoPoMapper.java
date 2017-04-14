package com.edp.dao.mapper;

import com.edp.dao.domain.ReplyInfoPo;
import com.edp.dao.domain.ReplyInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyInfoPoMapper {
    int countByExample(ReplyInfoPoCriteria example);

    int deleteByExample(ReplyInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReplyInfoPo record);

    int insertSelective(ReplyInfoPo record);

    List<ReplyInfoPo> selectByExample(ReplyInfoPoCriteria example);

    ReplyInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReplyInfoPo record, @Param("example") ReplyInfoPoCriteria example);

    int updateByExample(@Param("record") ReplyInfoPo record, @Param("example") ReplyInfoPoCriteria example);

    int updateByPrimaryKeySelective(ReplyInfoPo record);

    int updateByPrimaryKey(ReplyInfoPo record);
}