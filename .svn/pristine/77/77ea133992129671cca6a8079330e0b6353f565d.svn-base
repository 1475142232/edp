package com.edp.service.tree;


import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.SequenceManage;
import com.edp.dao.domain.FunctionInfoPo;
import com.edp.dao.domain.TreeInfoPo;
import com.edp.dao.domain.TreeInfoPoCriteria;
import com.edp.dao.mapper.FunctionInfoPoMapper;
import com.edp.dao.mapper.TreeInfoPoMapper;
import com.edp.serviceI.dto.ProductDto;
import com.edp.serviceI.dto.TreeInfoDto;
import com.edp.serviceI.tree.TreeServiceI;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service(value = "TreeService")
public class TreeServiceImpl implements TreeServiceI {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TreeServiceImpl.class);
	@Autowired
	private TreeInfoPoMapper treeMapper;
	@Autowired
	private FunctionInfoPoMapper functionMapper;

	@Override
	public TreeInfoDto findTreeById(String productId) {
		TreeInfoPoCriteria exampleRoot = new TreeInfoPoCriteria();
		TreeInfoPoCriteria.Criteria criteriaRoot = exampleRoot.createCriteria();
		criteriaRoot.andTreeParentEqualTo(productId);
		criteriaRoot.andTreeStateEqualTo("01");
		TreeInfoPo po = treeMapper.selectByExample(exampleRoot).get(0);
		TreeInfoDto dto = BeanCopyUtils.populateTbyDBySpring(po,TreeInfoDto.class);
		TreeInfoPoCriteria example = new TreeInfoPoCriteria();
		TreeInfoPoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTreeParentEqualTo(po.getId());
		criteria.andTreeStateEqualTo("01");
		List<TreeInfoPo> treeInfoPo = treeMapper.selectByExample(example);
		List<TreeInfoDto> treeInfoDto=BeanCopyUtils.populateTListbyDListBySpring(treeInfoPo,TreeInfoDto.class);
		for(int i=0;i<treeInfoDto.size();i++){
			TreeInfoPoCriteria treeNode = new TreeInfoPoCriteria();
			TreeInfoPoCriteria.Criteria teeNodeCriteria = treeNode.createCriteria();
			teeNodeCriteria.andTreeParentEqualTo(treeInfoDto.get(i).getId());
			teeNodeCriteria.andTreeStateEqualTo("01");
			List<TreeInfoPo> treeNodePo = treeMapper.selectByExample(treeNode); 		
			List<TreeInfoDto> treeNodeDto = BeanCopyUtils.populateTListbyDListBySpring(treeNodePo,TreeInfoDto.class);		
			if(i!=2){
				for(int j=0;j<treeNodeDto.size();j++){
					TreeInfoPoCriteria treeNodeTwo = new TreeInfoPoCriteria();
					TreeInfoPoCriteria.Criteria two = treeNodeTwo.createCriteria();
					two.andTreeParentEqualTo(treeNodeDto.get(j).getId());
					two.andTreeStateEqualTo("01");
					List<TreeInfoPo> treeTwoPo = treeMapper.selectByExample(treeNodeTwo);
					List<TreeInfoDto> treeTwoDto = BeanCopyUtils.populateTListbyDListBySpring(treeTwoPo,TreeInfoDto.class);
					treeNodeDto.get(j).setChildren(treeTwoDto);
				}
			}	
			treeInfoDto.get(i).setChildren(treeNodeDto);
		}
		dto.setChildren(treeInfoDto);
		return dto;
	}

	@Override
	public Integer addTreeNode(TreeInfoDto dto) {
		TreeInfoPo po=BeanCopyUtils.populateTbyDBySpring(dto,TreeInfoPo.class);
		return treeMapper.insert(po);
	}

	@Override
	public Integer editTreeNode(TreeInfoDto dto) {
		TreeInfoPo po=BeanCopyUtils.populateTbyDBySpring(dto,TreeInfoPo.class);
		return treeMapper.updateByPrimaryKeySelective(po);
	}
    /**
     *  2016/9/12 
     *  zhang_cancan 
     */
	@Override
	public Integer addProductTree(ProductDto productDto) {
		TreeInfoPo root = new TreeInfoPo();
		String rootId=SequenceManage.getSequence("");
		root.setId(rootId);
		root.setTreeId(productDto.getId());
		root.setTreeLeaf("0");
		root.setTreeName(productDto.getProductName());
		root.setTreeParent(productDto.getId());
		root.setTreeState("01");
		root.setTreeType("1");//根节点的type为1
		treeMapper.insert(root);
        String[] leftName=new String[]{"场景","功能","原型图","数据库"};
        String[] leftType=new String[]{"2","3","4","5"};
        for(int i=0;i<leftName.length;i++){
        	TreeInfoPo left = new TreeInfoPo();
        	left.setId(SequenceManage.getSequence(""));
        	left.setTreeId(productDto.getId());
        	left.setTreeName(leftName[i]);
        	left.setTreeLeaf("0");
        	left.setTreeName(leftName[i]);
        	left.setTreeParent(rootId);
        	left.setTreeState("01");
        	left.setTreeType(leftType[i]);
        	treeMapper.insert(left);
        }
		return 5;
	}
    
	/**
	 * 查询特定列表
	 */
	@Override
	public List<TreeInfoDto> findTreeByType(String productId,String type) {
		TreeInfoPoCriteria example = new TreeInfoPoCriteria();
		TreeInfoPoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTreeIdEqualTo(productId);
		criteria.andTreeTypeEqualTo(type);
		criteria.andTreeStateEqualTo("01");
		List<TreeInfoPo> treeInfoPo = treeMapper.selectByExample(example);
		return BeanCopyUtils.populateTListbyDListBySpring(treeInfoPo,TreeInfoDto.class);
	}

	@Override
	public List<TreeInfoDto> findParentByproductId(String productId) {
		String[] type = {"2","3","4","5"};
		TreeInfoPoCriteria example = new TreeInfoPoCriteria();
		TreeInfoPoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTreeIdEqualTo(productId);
		return null;
	}

	/**
	 * 根据父id查询
	 */
	@Override
	public List<TreeInfoDto> findTreeNodeByPid(String id) {
		TreeInfoPoCriteria example = new TreeInfoPoCriteria();
		TreeInfoPoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTreeParentEqualTo(id);
		criteria.andTreeStateEqualTo("01");
		List<TreeInfoPo> treeInfoPo = treeMapper.selectByExample(example);
		return BeanCopyUtils.populateTListbyDListBySpring(treeInfoPo,TreeInfoDto.class);
	}

	@Override
	public TreeInfoDto findTreeNodeById(String id) {
		TreeInfoPo po = treeMapper.selectByPrimaryKey(id);
		return BeanCopyUtils.populateTbyDBySpring(po,TreeInfoDto.class);
	}

	@Override
	public Integer addFunctionByTree(TreeInfoDto dto) {
		TreeInfoPo po=BeanCopyUtils.populateTbyDBySpring(dto,TreeInfoPo.class);
		treeMapper.insert(po);
		FunctionInfoPo fPo = new FunctionInfoPo();
		fPo.setId(dto.getId());
		fPo.setFunctionName(dto.getTreeName());    
		return functionMapper.insert(fPo);
	}

	@Override
	public Integer editTreeState(List<String> ids) {
		TreeInfoPoCriteria example = new TreeInfoPoCriteria();
		TreeInfoPoCriteria.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		return null;
	}

  
}
