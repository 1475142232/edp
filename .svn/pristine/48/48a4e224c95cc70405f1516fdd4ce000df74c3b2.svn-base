package com.edp.dao.mapper;

import com.edp.dao.domain.StencilTreePo;
import com.edp.dao.domain.StencilTreePoCriteria;
import com.edp.dao.domain.TableColunmPo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StencilTreePoMapper {
    int countByExample(StencilTreePoCriteria example);

    int deleteByExample(StencilTreePoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(StencilTreePo record);

    int insertSelective(StencilTreePo record);

    List<StencilTreePo> selectByExample(StencilTreePoCriteria example);

    StencilTreePo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StencilTreePo record, @Param("example") StencilTreePoCriteria example);

    int updateByExample(@Param("record") StencilTreePo record, @Param("example") StencilTreePoCriteria example);

    int updateByPrimaryKeySelective(StencilTreePo record);

    int updateByPrimaryKey(StencilTreePo record);

	Integer findCountById(@Param("product_id")String pId, @Param("stencil_node_id")String id);

	String findtreeNodeParentById(@Param("product_id")String pId, @Param("stencil_node_id")String id);

	void addTreeNode(@Param("product_id")String pId, @Param("stencil_node_id")String id, @Param("tree_node_id")String newId);

	List<TableColunmPo> findTableById(@Param("control_id")String control_id, @Param("func_id")String funId);

	List<TableColunmPo> findColumnById(@Param("control_id")String control_id, @Param("table_id")String id);

	void delStencilByProduct(@Param("product_id")String proId);

	void delStencilById(@Param("treeNodeId")String id, @Param("product_id")String treeNodeId);

}