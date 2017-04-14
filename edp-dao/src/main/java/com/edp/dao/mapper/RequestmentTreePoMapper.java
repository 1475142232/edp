package com.edp.dao.mapper;

import com.edp.dao.domain.RequestmentTreePo;
import com.edp.dao.domain.RequestmentTreePoCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RequestmentTreePoMapper {
    int countByExample(RequestmentTreePoCriteria example);

    int deleteByExample(RequestmentTreePoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(RequestmentTreePo record);

    int insertSelective(RequestmentTreePo record);

    List<RequestmentTreePo> selectByExample(RequestmentTreePoCriteria example);

    RequestmentTreePo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RequestmentTreePo record, @Param("example") RequestmentTreePoCriteria example);

    int updateByExample(@Param("record") RequestmentTreePo record, @Param("example") RequestmentTreePoCriteria example);

    int updateByPrimaryKeySelective(RequestmentTreePo record);

    int updateByPrimaryKey(RequestmentTreePo record);
    
    List<String> findNodeByLevel(@Param("tree_node_id")String treeNodeId, @Param("tree_node_levels")Integer treeNodeLevels,@Param("tree_node_state")String tree_node_state);

	List<String> findRequestById(@Param("id")String id);

	Integer findConfirmById(@Param("id")String string, @Param("state")String state);

	Integer findFindConfirmById(@Param("id")String string, @Param("state")String state);

	List<RequestmentTreePo> findfuncByState(@Param("id")String productId);

	List<RequestmentTreePo> findTreeById(@Param("treeId")String id, @Param("tree_node_state")String state);

	List<String> findTreeIdByPid(@Param("treeNodeParent")String id);

	Integer addMasterTmp(@Param("tree")String json, @Param("product_id")String id,@Param("type")String type);

	String findJsonTreeById(@Param("product_id")String id,@Param("type")String type);

	Integer editTreeByProductId(@Param("product_id")String productId, @Param("tree")String resulet,@Param("type")String state);

	Integer findCountNotEnterByTreeId(@Param("product_id")String productId,@Param("state")String state);

	Integer insertMaster(@Param("tree")String tree, @Param("product_id")String productId, @Param("version")Integer version);

	Integer updateTreeNodeState(@Param("product_id")String productId, @Param("state")String string);

	String findEnterTreeById(@Param("product_id")String productId,@Param("version")Integer version);

	Integer findCountTypeByState(@Param("product_id")String id, @Param("type")String string, @Param("state")String string2);
}