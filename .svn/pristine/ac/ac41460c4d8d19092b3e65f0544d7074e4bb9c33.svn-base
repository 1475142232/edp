package com.edp.service;

import com.alibaba.fastjson.JSON;
import com.edp.common.constant.EDPCodeConstants;
import com.edp.serviceI.dto.FunctionChangeHisDto;
import com.edp.serviceI.functionChangeHis.FunctionChangeHisServiceI;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/5/25.
 */
public class FunctionChangeHisServiceTest extends JunitTestBase {


    @Resource
    private FunctionChangeHisServiceI functionChangeHisServiceI;


//    @Test
    public void testFunctionChangeHisSave(){

        FunctionChangeHisDto saveDto = new FunctionChangeHisDto();


        saveDto.setFuncId("11111");
        saveDto.setFuncEnName("add");
        saveDto.setFuncName("变更-新增");
        saveDto.setFuncSpec("说明");



        FunctionChangeHisDto rtn =  functionChangeHisServiceI.saveFunctionChangeHis(saveDto);
        Assert.assertEquals("保存失败", EDPCodeConstants.SUCCESS_CODE,rtn.getReturnCode());
    }



    public FunctionChangeHisDto testFindFunctionChangeHisById(int id){

        FunctionChangeHisDto rtn = this.functionChangeHisServiceI.findFunctionChangeHisById(id);

        Assert.assertEquals("根据编号查询变更历史记录失败",EDPCodeConstants.SUCCESS_CODE,rtn.getReturnCode());

        return rtn;

    }



    public FunctionChangeHisDto testQueryFunctionChangeHisList(){

        FunctionChangeHisDto paramsDto = new FunctionChangeHisDto();
        paramsDto.setFuncId("11111");

        FunctionChangeHisDto rtn = this.functionChangeHisServiceI.queryFunctionChangeHisList(paramsDto);



        Assert.assertEquals("查询变更历史记录失败",EDPCodeConstants.SUCCESS_CODE,rtn.getReturnCode());

        if(rtn.getResults()>0){
            List<FunctionChangeHisDto> dtos = rtn.getRows();
            for(FunctionChangeHisDto dto : dtos){

                System.out.println(JSON.toJSON(dto));
            }
        }



        return rtn;
    }



    public void testFunctionChangeHisUpdate(int id){

        FunctionChangeHisDto updateDto = new FunctionChangeHisDto();

        updateDto.setId(id);
        updateDto.setFuncId("11111");
        updateDto.setFuncEnName("add");
        updateDto.setFuncName("变更-新增");
        updateDto.setFuncSpec("说明");

        FunctionChangeHisDto rtn =  this.functionChangeHisServiceI.updateFunctionChangeHis(updateDto);

        Assert.assertEquals("更新失败", EDPCodeConstants.SUCCESS_CODE,rtn.getReturnCode());

    }


//    @Test
    public void testFindFunctionChangeHisByFuncId(){


        FunctionChangeHisDto updateDto =this.functionChangeHisServiceI.findFunctionChangeHisListByFuncId("11111");

       List<FunctionChangeHisDto> dtos = updateDto.getRows();

        for(FunctionChangeHisDto dto : dtos){
            System.out.println(JSON.toJSON(dto));
        }


    }

    public void testDeleteFunctionChangeHisByFuncId(){
        FunctionChangeHisDto rtn = this.functionChangeHisServiceI.deleteFunctionChangeHisByFuncId("11111");

        Assert.assertEquals("根据功能编号删除变更历史记录失败", EDPCodeConstants.SUCCESS_CODE,rtn.getReturnCode());
    }

    public void testDeleteFunctionChangeHisById(int id){
        FunctionChangeHisDto rtn = this.functionChangeHisServiceI.deleteFunctionChangeHisById(id);

        Assert.assertEquals("根据功能编号删除变更历史记录失败", EDPCodeConstants.SUCCESS_CODE,rtn.getReturnCode());
    }


    @Test
    public void testSuit(){

         this.testQueryFunctionChangeHisList();


        this.testFunctionChangeHisSave();

        FunctionChangeHisDto rtn = this.testQueryFunctionChangeHisList();

        int id = ((FunctionChangeHisDto)rtn.getRows().get(0)).getId();
        this.testFunctionChangeHisUpdate(id);

        this.testFindFunctionChangeHisById(id);

        this.testDeleteFunctionChangeHisByFuncId();

        this.testDeleteFunctionChangeHisByFuncId();
        this.testDeleteFunctionChangeHisById(id);

        this.testFunctionChangeHisSave();

        this.testDeleteFunctionChangeHisByFuncId();


    }
}
