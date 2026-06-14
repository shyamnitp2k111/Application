package com.springbootapplication.application.filter;

import jakarta.servlet.*;
import java.io.IOException;

public class CustomFilters implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" [ Filter 2 - Entry ] Inside custom filters ");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println(" [ Filter 2 - Exit ] Inside custom filters ");
    }
}
