package com.edp.service;

import com.edp.common.constant.EDPCodeConstants;
import com.edp.serviceI.dto.RequestmentDto;
import com.edp.serviceI.tree.TreeServiceI;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by PCZ0076 on 2016/5/23.
 */
public class TreeServiceTest extends JunitTestBase {

    @Resource
    private TreeServiceI treeServiceI;

    @Test
    public void testNormalRequestmentComfirm(){


//        RequestmentDto requestmentDto = treeServiceI.normalRequestmentComfirm("123");
//        Assert.assertEquals("正常需求确认方法执行失败", EDPCodeConstants.SUCCESS_CODE, requestmentDto.getReturnCode());

    }

    @Test
    public void testChangeRequestmentComfirm(){


//        RequestmentDto requestmentDto = treeServiceI.changeRequestmentComfirm("123");
//        Assert.assertEquals("变更需求确认方法执行失败", EDPCodeConstants.SUCCESS_CODE, requestmentDto.getReturnCode());

    }

}
