package com.edp.admin.common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class CharacterEncodingFilter
 */
@WebFilter("/CharacterEncodingFilter")
public class CharacterEncodingFilter implements Filter {

    /**
     * Default constructor.
     */
    public CharacterEncodingFilter() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /**
     * 
     * doFilter:(字符编码过滤). <br/>
     * @author st-ln2633
     * @param request request
     * @param response response
     * @param chain chain
     * @throws IOException 异常
     * @throws ServletException 异常
     * @since JDK 1.7
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        // place your code here
        request.setCharacterEncoding("UTF-8");
        // pass the request along the filter chain
        chain.doFilter(request, response);
        request.setCharacterEncoding("UTF-8");
    }

    /**
     * 
     * init:(初始化). <br/>
     * @author st-ln2633
     * @param fConfig fConfig
     * @throws ServletException 异常
     * @since JDK 1.7
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

}
