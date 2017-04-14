package com.edp.admin.module;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.edp.common.constant.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edp.admin.common.BaseController;
import com.edp.admin.login.UserInfoBean;
import com.edp.common.utils.SequenceManage;
import com.edp.serviceI.dto.ModuleInfoDto;
import com.edp.serviceI.dto.RequestmentDto;
import com.edp.serviceI.moduleinfo.ModuleInfoServiceI;
import com.edp.serviceI.tree.TreeServiceI;
import com.google.gson.Gson;

/**
 * @author wu_jianxing(吴建行)
 *         时间：2016.4.21
 */
@Controller
@RequestMapping("moduleController")
public class ModuleController extends BaseController {
    @Autowired
    private ModuleInfoServiceI moduleInfoService;
    @Autowired
    private TreeServiceI treeServiceI;


    private static final Logger LOGGER = LoggerFactory.getLogger(ModuleController.class);

    private Gson gson = new Gson();

    @RequestMapping(value = "/modulelist.action", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getAllModules(ModuleInfoDto dto) {
        ModuleInfoDto allModules = moduleInfoService.getAllModules(dto);
        return gson.toJson(allModules);
    }

    //根据id查询商品
    @RequestMapping(value = "/getmoduleById.action", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String selectModuleById(String proId) {
        ModuleInfoDto moduleById = moduleInfoService.getModuleById(proId);
        return gson.toJson(moduleById);
    }

    //添加商品
    @RequestMapping(value = "/addmodule.action", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String addModule(String ModuleName, String ParentId, String addType, String opType, HttpSession session) {
        String[] names = ModuleName.split("\r\n");//根据回车截取字符串("\n")
        ModuleInfoDto module = new ModuleInfoDto();//创建插入模块表的承载类
        RequestmentDto cDto = new RequestmentDto();//创建要插入的新节点的承载类f
        RequestmentDto pDto = new RequestmentDto();//创建要修改的父节点的承载类
        //获取系统时间
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //根据opType 赋值 treeNodeState
        String treeNodeState = Constants.TreeStates.NORMAL_ADD;//默认都是正常新增
        if ("2".equals(opType)) {
            treeNodeState = Constants.TreeStates.CHANGE_ADD;
        }
        //获取session中的用户信息
        UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("userInfoBean");
        for (int i = 0; i < names.length; i++) {
            if (names[i].trim().equals("")) {
                continue;
            }
            String id = SequenceManage.getSequence("");
            module.setId(id);
            module.setModuleCreater(userInfoBean.getUsername());
            module.setModuleCreatetime(sdf.format(today));
            module.setModuleName(names[i].trim());
            moduleInfoService.addModule(module);
            cDto.setId(id);
            cDto.setTreeNodeLevels(2);
            cDto.setTreeNodeType("6");
            cDto.setTreeNodeIfLeaf("0");
            cDto.setTreeNodeParent(ParentId);
            cDto.setTreeNodeName(names[i].trim());
            cDto.setTreeNodeCreateperson(userInfoBean.getUsername());
            cDto.setTreeNodeCreatetime(sdf.format(today));
            cDto.setTreeNodeState(treeNodeState);
//            treeServiceI.addTreeNode(cDto, (String) session.getAttribute("productId"));
            pDto.setId(ParentId);
            pDto.setTreeNodeIfLeaf("0");
            //预存
            pDto.setTreeNodeModifiedtime(sdf.format(today));
//            treeServiceI.editTreeNode(pDto);
        }
        return gson.toJson("1");
    }

    //修改商品
    @RequestMapping(value = "/updatemodule.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String updateModule(ModuleInfoDto dto, HttpSession session) {
        //获取系统时间
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取session中的用户信息
        UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("userInfoBean");
        dto.setModuleModifiedPerson(userInfoBean.getUsername());
        dto.setModuleModifiedTime(sdf.format(today));
        moduleInfoService.updateModule(dto);
        RequestmentDto treeDto = new RequestmentDto();//修改树
        treeDto.setId(dto.getId());
        treeDto.setTreeNodeName(dto.getModuleName());
        treeDto.setTreeNodeModifiedtime(sdf.format(today));
//        treeServiceI.editTreeNode(treeDto);
        //预存
        //treeDto.setTreeNodeModifiedPerson(userInfoBean.getUsername());
        return gson.toJson("1");
    }

    //删除商品
    @RequestMapping(value = "/delmodule.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String delModule(String proId) {
        moduleInfoService.delModule(proId);
        return null;
    }

    @RequestMapping(value = "/funToModule.action", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String funToModule(String id, HttpSession session) {
        //获取系统时间
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取session中的用户信息
        UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("userInfoBean");
//        RequestmentDto cDto = treeServiceI.findTreeNodeById(id);
//        RequestmentDto pDto = treeServiceI.findTreeNodeById(cDto.getTreeNodeParent());
//        cDto.setTreeNodeParent(pDto.getTreeNodeParent());
//        cDto.setTreeNodeModifiedtime(sdf.format(today));
//        cDto.setTreeNodeLevels(4);
        //预留修改人
//        treeServiceI.editTreeNode(cDto);
        return gson.toJson("");
    }

    @RequestMapping(value = "/moduleToFun.action", method = {RequestMethod.GET, RequestMethod.POST})
    public String moduleToFun(String id, HttpSession session) {
        //获取系统时间
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取session中的用户信息
        UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("userInfoBean");
        return gson.toJson("1");
    }

}
