package com.edp.serviceI.data;

import java.util.List;

import com.edp.serviceI.dto.DataInfoDto;

public interface DataServiceI {

	List<DataInfoDto> findAllData(String teamId, Integer userId);

	Integer addData(DataInfoDto dto);

	Integer editData(DataInfoDto dto);

	DataInfoDto findDataById(DataInfoDto dto);

	List<DataInfoDto> findDataByproductId(String productId);

}
