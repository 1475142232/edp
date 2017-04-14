package com.edp.common.container;

import com.alibaba.dubbo.common.utils.ConfigUtils;
import com.alibaba.dubbo.container.Container;
import com.edp.common.utils.LogInit;

/**
 * Logback初始化容器. 设置日志规范中的Product,Module,Node
 */
public class BocLogContainer implements Container {
    /** 产品名. */
    public static final String PRODUCT = "logback.product";
    /** 模块名. */
    public static final String MODULE = "logback.module";
    /** 节点号. */
    public static final String NODE = "logback.node";

    @Override
    public void start() {
        new LogInit(
                ConfigUtils.getProperty(PRODUCT),
                ConfigUtils.getProperty(MODULE),
                ConfigUtils.getProperty(NODE));
    }

    @Override
    public void stop() {
        //Log Contain doesn't need stop
    }
}
