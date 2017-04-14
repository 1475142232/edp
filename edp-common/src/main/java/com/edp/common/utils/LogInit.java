package com.edp.common.utils;

/**
 * ClassName: LogInit <br/>
 * Function: 启动日志. <br/>
 * date: 2015年1月7日 下午1:16:51 <br/>
 * 
 * @author st-sb3915
 * @version
 * @since JDK 1.6
 */
public final class LogInit {

    public LogInit(String productId, String moduleId, String nodeId) {
        System.setProperty(ZgbLogUtil.CYWS_PRODUCT_NAME, productId);
        System.setProperty(ZgbLogUtil.CYWS_MODULE_NAME, moduleId);
        System.setProperty(ZgbLogUtil.CYWS_NODE_NAME, nodeId);
        ZgbLogUtil.registerProcessID(UUIDUtil.generateUUID());
    }
}
