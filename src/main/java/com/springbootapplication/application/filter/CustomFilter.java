package com.springbootapplication.application.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
public class CustomFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" [ Filter - Entry ] Inside custom filter ");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println(" [ Filter - Exit ] Inside custom filter ");
    }
}
