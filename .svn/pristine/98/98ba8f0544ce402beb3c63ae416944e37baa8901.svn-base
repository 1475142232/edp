package com.edp.service;

import com.alibaba.fastjson.JSON;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.serviceI.dto.ReqChangeInfoDto;
import com.edp.serviceI.reqChangeInfo.ReqChangeInfoServiceI;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by changer on 2016/5/25.
 */
public class ReqChangeInfoServiceTest extends JunitTestBase {

    @Resource
    private ReqChangeInfoServiceI reqChangeInfoServiceI;

    @Test
    public void testSuit() {

        this.testQueryList();
        this.testSave();

        ReqChangeInfoDto rtn = this.testQueryList();

        int id = ((ReqChangeInfoDto) rtn.getRows().get(0)).getId();

        this.testUpdate(id);

        this.testFindByID(id);

        this.testFindByFuncId();

        this.testDeleteById(id);

        this.testSave();

        this.testDeleteByFuncId();

    }


    public ReqChangeInfoDto testQueryList() {

        ReqChangeInfoDto param = new ReqChangeInfoDto();
        ReqChangeInfoDto rtn = this.reqChangeInfoServiceI.queryReqChangeInfoList(param);

        if (rtn.getResults() > 0) {
            List<ReqChangeInfoDto> dtos = rtn.getRows();
            for (ReqChangeInfoDto dto : dtos) {
                System.out.println(JSON.toJSON(dto));
            }
        }
        Assert.assertEquals("列表查询事变", EDPCodeConstants.SUCCESS_CODE, rtn.getReturnCode());

        return rtn;
    }


    public void testSave() {
        ReqChangeInfoDto saveDto = new ReqChangeInfoDto();

        saveDto.setFunctionId("111111");
        saveDto.setFunctionName("需求变更模块-新增");
        saveDto.setReason("新增变更审核模块");
        saveDto.setContent("增加了四个功能,分别是......");
        saveDto.setImpact("需要修改功能模块的CRUD方法");
        saveDto.setApplyor("changer");
        saveDto.setApplyTime("2016-5-25");

        ReqChangeInfoDto rtn = this.reqChangeInfoServiceI.saveReqChangeInfo(saveDto);

        Assert.assertEquals("新增变更信息失败", EDPCodeConstants.SUCCESS_CODE, rtn.getReturnCode());

    }

    public void testUpdate(int id) {
        ReqChangeInfoDto updateDto = new ReqChangeInfoDto();

        updateDto.setId(id);
        updateDto.setFunctionId("111111");
        updateDto.setFunctionName("需求变更模块-新增");
        updateDto.setReason("新增变更审核模块");
        updateDto.setContent("增加了四个功能,分别是......xxxxxxxxxxxxxxxxxxxxxx");
        updateDto.setImpact("需要修改功能模块的CRUD方法");
        updateDto.setApplyor("changer");
        updateDto.setApplyTime("2016-5-25");

        ReqChangeInfoDto rtn = this.reqChangeInfoServiceI.updateReqChangeInfo(updateDto);

        Assert.assertEquals("更新变更信息失败", EDPCodeConstants.SUCCESS_CODE, rtn.getReturnCode());


    }

    public void testFindByID(int id) {

        ReqChangeInfoDto rtn = this.reqChangeInfoServiceI.findReqChangeInfoById(id);
        System.out.println(JSON.toJSON(rtn));
        Assert.assertEquals("根据信息编号查询失败", EDPCodeConstants.SUCCESS_CODE, rtn.getReturnCode());
    }


    public void testFindByFuncId() {
        ReqChangeInfoDto rtn = this.reqChangeInfoServiceI.findLastestReqChangeInfoByRefId("111111");


        if (rtn.getResults() > 0) {
            List<ReqChangeInfoDto> dtos = rtn.getRows();
            for (ReqChangeInfoDto dto : dtos) {
                System.out.println(JSON.toJSON(dto));
            }
        }

        Assert.assertEquals("根据功能编号查询失败", EDPCodeConstants.SUCCESS_CODE, rtn.getReturnCode());
    }

    public void testDeleteById(int id) {
        ReqChangeInfoDto rtn = this.reqChangeInfoServiceI.deleteReqChangeInfoById(id);

        Assert.assertEquals("根据信息编号查询记录失败", EDPCodeConstants.SUCCESS_CODE, rtn.getReturnCode());
    }

    public void testDeleteByFuncId() {
        ReqChangeInfoDto rtn = this.reqChangeInfoServiceI.deleteReqChangeInfoByFuncId("111111");
        Assert.assertEquals("根据功能编号查询记录失败", EDPCodeConstants.SUCCESS_CODE, rtn.getReturnCode());
    }
}
