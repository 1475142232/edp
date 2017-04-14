package com.edp.admin.reqChangeInfo;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.edp.admin.common.BaseController;
import com.edp.admin.login.UserInfoBean;
import com.edp.common.constant.Constants;
import com.edp.common.utils.BeanCopyUtils;
import com.edp.common.utils.DateUtil;
import com.edp.serviceI.columnInfo.ColumnInfoServiceI;
import com.edp.serviceI.dto.ColumnInfoDto;
import com.edp.serviceI.dto.FunctionInfoDto;
import com.edp.serviceI.dto.ReqChangeInfoDto;
import com.edp.serviceI.functionInfo.FunctionInfoServiceI;
import com.edp.serviceI.reqChangeInfo.ReqChangeInfoServiceI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * 需求变更信息表操作类
 * Created by changer on 2016/5/25.
 */

@Controller
@RequestMapping("reqChangeInfo")
public class ReqChangeInfoController extends BaseController {

    @Resource
    private ReqChangeInfoServiceI reqChangeInfoServiceI;//需求变更信息服务

   
}
