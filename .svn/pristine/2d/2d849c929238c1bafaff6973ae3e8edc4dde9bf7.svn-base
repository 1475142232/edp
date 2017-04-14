package com.edp.dao.mapper;

import com.edp.dao.domain.ReqChangeInfoPo;
import com.edp.dao.domain.ReqChangeInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqChangeInfoPoMapper {
    int countByExample(ReqChangeInfoPoCriteria example);

    int deleteByExample(ReqChangeInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReqChangeInfoPo record);

    int insertSelective(ReqChangeInfoPo record);

    List<ReqChangeInfoPo> selectByExample(ReqChangeInfoPoCriteria example);

    ReqChangeInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReqChangeInfoPo record, @Param("example") ReqChangeInfoPoCriteria example);

    int updateByExample(@Param("record") ReqChangeInfoPo record, @Param("example") ReqChangeInfoPoCriteria example);

    int updateByPrimaryKeySelective(ReqChangeInfoPo record);

    int updateByPrimaryKey(ReqChangeInfoPo record);
}