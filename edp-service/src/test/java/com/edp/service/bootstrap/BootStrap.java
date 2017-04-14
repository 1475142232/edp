package com.edp.service.bootstrap;

/**
 * ClassName: BootStrapService <br/>
 * Function: main <br/>
 * date: 2014年9月11日 上午10:55:46 <br/>
 * 
 * @author st-sb3915
 * @version
 * @since JDK 1.6
 */
    public class BootStrap {

    /**
     * main:(Start Service). <br/>
     * 
     * @author st-sb3915
     * @param args
     *            dubbo container xml
     * @since JDK 1.6
     */
    public static void main(String[] args) {
        com.alibaba.dubbo.container.Main.main(args);
    }
}