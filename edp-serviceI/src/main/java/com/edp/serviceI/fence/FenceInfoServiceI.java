package com.edp.serviceI.fence;

import java.util.List;

import com.edp.serviceI.dto.FenceInfoDto;

public interface FenceInfoServiceI {
	
	Integer addFencBase(String productId);

	List<FenceInfoDto> getAllFence(String productId,String state,String taskState);

	Integer addFence(FenceInfoDto fence);

	Integer editFence(FenceInfoDto fence);

	Integer addFencProductId(String id, String productId);

	String findFenceIdByType(String treeId, String string);

}
