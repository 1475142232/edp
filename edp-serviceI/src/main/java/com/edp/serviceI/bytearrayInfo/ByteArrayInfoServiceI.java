package com.edp.serviceI.bytearrayInfo;

import com.edp.serviceI.dto.BytearrayInfoDto;

/**
 * Created by PCZ0076 on 2016/5/20.
 */
public interface ByteArrayInfoServiceI {

     BytearrayInfoDto getAllFiles(BytearrayInfoDto bytearrayInfoDto) throws  Exception;

     BytearrayInfoDto getFileById(int id) throws  Exception;

     BytearrayInfoDto getFilesByTargetId(BytearrayInfoDto bytearrayInfoDto) throws  Exception;

     BytearrayInfoDto getFilesByFileName(String fileName) throws  Exception;

     BytearrayInfoDto updateBytearrayInfo(BytearrayInfoDto bytearrayInfoDto) throws  Exception;

    BytearrayInfoDto saveBytearrayInfo(BytearrayInfoDto bytearrayInfoDto) throws  Exception;

    BytearrayInfoDto deleteBytearrayInfoById(int id) throws  Exception;

    BytearrayInfoDto deleteBytearrayInfoByTargetId(String targetId) throws  Exception;

	BytearrayInfoDto findPicById(String id);
}
