package com.edp.admin.common;

import javax.servlet.http.HttpSession;

import com.edp.admin.login.UserInfoBean;
import com.edp.serviceI.dto.UserDto;
import com.google.gson.Gson;

/**
 * ClassName: BaseController
 *
 * @author st-cgy7615
 * @version
 * @since JDK 1.6
 */
public class BaseController {
    /**
     * @since JDK 1.7
     */
    public Gson gson;

    /**
     * @author st-cgy7615
     * @return json
     * @since JDK 1.7
     */
    public Gson getGson() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }
    
    /**
     * getUserBean:(获取用户信息). <br/>
     *
     * @author st-cgy7615
     * @param session 用户session
     * @return 用户bean
     * @since JDK 1.7
     */
    public UserInfoBean getUserInfoBean(HttpSession session) { //取出用户信息
        UserInfoBean userInfoBean = (UserInfoBean)session.getAttribute("userInfoBean");
        return userInfoBean;
    }

    /**
     * 获取用户详情
     * @param session
     * @return
     */
    public UserDto getUserDetail(HttpSession session){
        UserDto userDto = (UserDto)session.getAttribute("user");
        return userDto;
    }
}
