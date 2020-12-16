package com.util;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.util
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/9 19:14
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        //过滤器链条继续
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
