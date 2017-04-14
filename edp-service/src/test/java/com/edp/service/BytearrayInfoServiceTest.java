package com.edp.service;

import com.edp.serviceI.bytearrayInfo.ByteArrayInfoServiceI;
import com.edp.serviceI.dto.BytearrayInfoDto;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * 文件流服务测试类
 * Created by changer on 2016/5/20.
 */
public class BytearrayInfoServiceTest extends JunitTestBase {


    @Resource
    private ByteArrayInfoServiceI byteArrayInfoServiceI;


    @Test
    public void testAll() {

        BytearrayInfoDto bytearrayInfoDto = new BytearrayInfoDto();

        this.testQueryList();

        this.testSave();

        bytearrayInfoDto = this.testQueryList();

        int id = ((BytearrayInfoDto) bytearrayInfoDto.getRows().get(0)).getId();


        String targetId = "111111";

        bytearrayInfoDto = this.testFindById(id);

        this.testUpdate(bytearrayInfoDto);

        this.testFindByFileName("保存");

        this.testFindByTargetId(targetId);

        this.testDeleteById(id);

        this.testFindById(id);
        this.testSave();

        this.testDeleteByTargetId(targetId);

        this.testFindByTargetId(targetId);

    }


    @Test
    public void testSave() {

        try {
            System.out.println("执行文件信息新增操作");
            BytearrayInfoDto bytearrayInfoDto = new BytearrayInfoDto();
            bytearrayInfoDto.setFileName("文件保存测试");
            bytearrayInfoDto.setFileType("02");
            bytearrayInfoDto.setFileVersion(0);
            bytearrayInfoDto.setFileTargetid("111111");
            bytearrayInfoDto.setFileCreateTime("2016-5-20");
            File file = new File("EDP(辅助开发平台).doc");

            try {
                FileInputStream fis = new FileInputStream(file);
                int len = fis.available();
                byte[] buf = new byte[len];
                fis.read(buf);

                bytearrayInfoDto.setFileBytes(buf);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInfoServiceI.saveBytearrayInfo(bytearrayInfoDto);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public BytearrayInfoDto testQueryList() {
        BytearrayInfoDto bytearrayInfoDto = new BytearrayInfoDto();
        try {
            System.out.println("执行列表查询操作");
            bytearrayInfoDto = byteArrayInfoServiceI.getAllFiles(new BytearrayInfoDto());
            List<BytearrayInfoDto> bytearrayInfoDtos = bytearrayInfoDto.getRows();
            for (BytearrayInfoDto dto : bytearrayInfoDtos) {
                System.out.println("id=" + dto.getId() + " fileName=" + dto.getFileName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bytearrayInfoDto;
    }

    public BytearrayInfoDto testFindById(int id) {
        BytearrayInfoDto bytearrayInfoDto = new BytearrayInfoDto();
        try {
            System.out.println("执行ID查询操作");
            bytearrayInfoDto = byteArrayInfoServiceI.getFileById(id);
            System.out.println("输入的ID=" + id + "   根据ID查找结果: ID=" + bytearrayInfoDto.getId() + " fileName=" + bytearrayInfoDto.getFileName() + "  version=" + bytearrayInfoDto.getFileVersion());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bytearrayInfoDto;
    }

    public BytearrayInfoDto testFindByFileName(String fileName) {
        BytearrayInfoDto bytearrayInfoDto = new BytearrayInfoDto();
        try {
            System.out.println("执行fileName查询操作");
            bytearrayInfoDto = byteArrayInfoServiceI.getFilesByFileName(fileName);
            List<BytearrayInfoDto> bytearrayInfoDtos = bytearrayInfoDto.getRows();

            for (BytearrayInfoDto dto : bytearrayInfoDtos) {
                System.out.println("输入的文件名=" + fileName + "   根据fileName查找结果: ID=" + dto.getId() + " fileName=" + dto.getFileName() + " version=" + dto.getFileVersion());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bytearrayInfoDto;
    }

    public BytearrayInfoDto testFindByTargetId(String targetId) {
        BytearrayInfoDto bytearrayInfoDto = new BytearrayInfoDto();
        try {
            System.out.println("执行TargetId查询操作");


            BytearrayInfoDto paramDto = new BytearrayInfoDto();
            paramDto.setFileTargetid(targetId);
            bytearrayInfoDto = byteArrayInfoServiceI.getFilesByTargetId(paramDto);
            List<BytearrayInfoDto> bytearrayInfoDtos = bytearrayInfoDto.getRows();

            for (BytearrayInfoDto dto : bytearrayInfoDtos) {
                System.out.println("输入的TargetId=" + targetId + "   根据fileName查找结果: ID=" + dto.getId() + " fileName=" + dto.getFileName() + " version=" + dto.getFileVersion());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bytearrayInfoDto;
    }

    public void testUpdate(BytearrayInfoDto bytearrayInfoDto) {
        try {
            System.out.println("执行更新操作");
            bytearrayInfoDto.setFileVersion(1);
            byteArrayInfoServiceI.updateBytearrayInfo(bytearrayInfoDto);
            System.out.println("输入的参数={id:" + bytearrayInfoDto.getId() + ", fileName:" + bytearrayInfoDto.getFileName() + ",fileVersion:" + bytearrayInfoDto.getFileVersion() + ",filetarget:" + bytearrayInfoDto.getFileTargetid());
            this.testFindById(bytearrayInfoDto.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteById(int id) {
        try {
            System.out.println("执行删除操作");
            System.out.println("输入的ID=" + id);
            byteArrayInfoServiceI.deleteBytearrayInfoById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testDeleteByTargetId(String id) {
        try {
            System.out.println("执行删除操作");
            System.out.println("输入的TargetId=" + id);
            byteArrayInfoServiceI.deleteBytearrayInfoByTargetId(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
