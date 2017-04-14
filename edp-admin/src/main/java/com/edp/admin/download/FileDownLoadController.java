package com.edp.admin.download;

import com.alibaba.fastjson.JSON;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.serviceI.bytearrayInfo.ByteArrayInfoServiceI;
import com.edp.serviceI.dto.BytearrayInfoDto;
import com.edp.serviceI.dto.FunctionInfoDto;
import com.edp.serviceI.functionInfo.FunctionInfoServiceI;
import com.edp.serviceI.sceneinfo.SceneInfoServiceI;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件下载Controller类
 * Created by changer on 2016/5/19.
 */
@Controller
@RequestMapping("fileDownLoad")
public class FileDownLoadController {

    @Resource
    private ByteArrayInfoServiceI byteArrayInfoServiceI;


    /**
     * 根据文件所属的ID查询文件集合信息
     * @param dto
     * @return
     */
    @RequestMapping(value = "getFileListByTargetId", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getFileListByTargetId(BytearrayInfoDto dto) {
        BytearrayInfoDto rtn = new BytearrayInfoDto();

        try {
            rtn = byteArrayInfoServiceI.getFilesByTargetId(dto);

        } catch (Exception e) {

            rtn.setReturnCode(EDPCodeConstants.ERROR_CODE);
            rtn.setReturnInfo(EDPCodeConstants.ERROR_MSG);

        }

        return JSON.toJSONString(rtn);
    }


    /**
     * 根据文件编号下载文件
     *
     * @param id 文件编号
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "downloadFileById", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity downLoadFileById(int id) throws IOException {


        BytearrayInfoDto bytearrayInfoDto = new BytearrayInfoDto();

        try {
            bytearrayInfoDto = byteArrayInfoServiceI.getFileById(id);

        } catch (Exception e) {

        }

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        String fileName = bytearrayInfoDto.getFileName() + ".doc";
        httpHeaders.setContentDispositionFormData("attachment", new String(fileName.getBytes("utf-8"), "ISO8859-1"));
        httpHeaders.set("charset", "utf-8");


        return new ResponseEntity(bytearrayInfoDto.getFileBytes(), httpHeaders, HttpStatus.CREATED);
    }


}
