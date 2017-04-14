/**
 * Project Name:zgb-admin
 * File Name:LoginController.java
 * Package Name:com.isoftstone.ebiz.zgb.admin.login
 * Date:2015年5月16日下午1:12:37
 * Copyright (c) 2015, 开发七部 All Rights Reserved.
 *
*/

package com.edp.admin.login;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.edp.admin.common.BaseController;
import com.edp.common.constant.Constants;
import com.edp.common.utils.ImageUtil;
import com.edp.common.utils.MD5Util;
import com.edp.serviceI.dto.UserInfoDto;
import com.edp.serviceI.logininfo.LoginInfoServiceI;
import com.edp.serviceI.user.UserServiceI;
import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ClassName:LoginController
 * Date:     2015年5月16日 下午1:12:37
 * @author   st-cgy7615
 * @version
 * @since    JDK 1.6
 * @see
 */
@Controller
@RequestMapping("loginController")
public class LoginController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
   
    
    @Resource
    private LoginInfoServiceI loginInfoServiceI;
    @Resource
    private UserServiceI userService;


    /**
     * login:跳转登录页面.
     *
     * @author st-cgy7615
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/loginPage.action", method = { RequestMethod.GET })
    public ModelAndView loginPage() {
    	return new ModelAndView("./systemlogin/login");
    }
    /**
     * login:后台登陆.
     *
     * @author st-cgy7615
     * @param userInfoBean
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/login.action", method = { RequestMethod.POST })
    @ResponseBody
    public String login(UserInfoDto dto, String teamId,HttpSession session) {
    	dto.setUserPassword(MD5Util.MD5(dto.getUserPassword()));
		List<UserInfoDto> YON=userService.LoginUser(dto,teamId);
		gson = new Gson();
		if(YON.size()!=0){
			UserInfoBean userInfoBean=new UserInfoBean();
			userInfoBean.setUsername(YON.get(0).getUserName());
			session.setAttribute("user",YON.get(0));
			session.setAttribute("userInfoBean",userInfoBean);
			return gson.toJson("0000");
		}
		return gson.toJson("用户名或密码错误");
    }
    /**
     * getUserInfo:读取权限系统
     *
     * @author st-cgy7615
     * @param session
     * @return String
     * @since JDK 1.6
     */
    @RequestMapping(value = "/getUserInfo.action", method = { RequestMethod.POST })
    @ResponseBody
    public String getUserInfo(HttpSession session) {
    	gson = new Gson();
    	UserInfoBean userInfoBean = (UserInfoBean)session.getAttribute("userInfoBean");
        LOGGER.info("读取权限系统");
        if(userInfoBean != null) {
        	return gson.toJson(userInfoBean);
        }
        return null;
    }
    /**
     * signout:退出
     *
     * @author st-cgy7615
     * @param session
     * @return String
     * @since JDK 1.6
     */
    @RequestMapping(value = "/signout.action", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public String signout(HttpSession session) {
    	gson = new Gson();
    	session.removeAttribute("userInfoBean");
        LOGGER.info("退出系统");
    	return gson.toJson("SUCCESS");
    }
    /**
     * randomImg:随机验证码
     *
     * @author st-cgy7615
     * @param session
     * @return String
     * @since JDK 1.6
     */
    @RequestMapping(value = "/randomImg.action", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public byte[] randomImg(HttpSession session) {
    	Map<String, Object> randomImage = new HashMap<String, Object>();
    	ImageUtil.createRandomImage(Constants.RAND_KEY_NAME, Constants.IMAGE_KEY_NAME, randomImage);
		session.setAttribute("validCode", String.valueOf(randomImage.get(Constants.RAND_KEY_NAME)).toLowerCase());
    	BufferedImage image = (BufferedImage)randomImage.get(Constants.IMAGE_KEY_NAME);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
			ImageIO.write(image, "gif", out);
		} catch (IOException e) {
			LOGGER.error("验证码打印失败", e.getMessage());
		}
        byte[] b = out.toByteArray();
    	return b;
    }

    /**
     * 判断当前用户是否登录
     * @param session
     * @return
     * @author  changer 2016-5-23
     */
    @RequestMapping(value = "/checkIfUserLogin.action", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public String checkIfUserLogin(HttpSession session){

        String loginState = Constants.LOGINSTATE_UNLOGINED;

        UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("userInfoBean");
        if(userInfoBean != null && StringUtils.isNotEmpty(userInfoBean.getUsername())){
            loginState = Constants.LOGINSTATE_LOGINED;
        }
        return loginState;
    }
    /**
     * login:后台登陆.
     *
     * @author st-cgy7615
     * @return
     * @since JDK 1.6
     */
    public static void main(String agrs[]){
    	System.out.println(MD5Util.MD5("111111"));
    }
    /**
     * register:跳转注册页面.
     *
     * @author wangtian
     * @return
     * @since JDK 1.6
     */
    @RequestMapping(value = "/registerPage.action", method = { RequestMethod.GET })
    public ModelAndView registerPage() {
    	return new ModelAndView("./systemlogin/register");
    }
}

