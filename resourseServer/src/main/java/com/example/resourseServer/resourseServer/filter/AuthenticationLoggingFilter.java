package com.example.resourseServer.resourseServer.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

//public class AuthenticationLoggingFilter extends OncePerRequestFilter {
//    Logger logger = Logger.getLogger(AuthenticationLoggingFilter.class.getName());
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException {
//
//        Enumeration<String> headerNames = request.getHeaderNames();
//
//        while (headerNames.hasMoreElements()){
//            String s = headerNames.nextElement();
//
//            logger.info(s + request.getHeader(s));
//        }
//        filterChain.doFilter(request,response);
//
//    }
//}
