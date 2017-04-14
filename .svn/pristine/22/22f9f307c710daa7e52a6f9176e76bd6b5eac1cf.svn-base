package com.edp.dao.mapper;

import com.edp.dao.domain.FunConTrolPo;
import com.edp.dao.domain.FunConTrolPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunConTrolPoMapper {
    int countByExample(FunConTrolPoCriteria example);

    int deleteByExample(FunConTrolPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(FunConTrolPo record);

    int insertSelective(FunConTrolPo record);

    List<FunConTrolPo> selectByExample(FunConTrolPoCriteria example);

    FunConTrolPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FunConTrolPo record, @Param("example") FunConTrolPoCriteria example);

    int updateByExample(@Param("record") FunConTrolPo record, @Param("example") FunConTrolPoCriteria example);

    int updateByPrimaryKeySelective(FunConTrolPo record);

    int updateByPrimaryKey(FunConTrolPo record);
}