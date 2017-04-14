package com.edp.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.edp.common.utils.UUIDUtil;
import com.edp.common.utils.ZgbLogUtil;

/**
 * Created by zgy3575 on 2014/8/29.
 */
public class LogFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(LogFilter.class);
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug("init LogFilter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ZgbLogUtil.registerProcessID(UUIDUtil.generateUUID());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        //Log filter doesn't need destroy
        logger.debug("init destroy");
    }
}
