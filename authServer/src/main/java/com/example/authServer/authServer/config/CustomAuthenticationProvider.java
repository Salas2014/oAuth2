package com.example.authServer.authServer.config;

import com.example.authServer.authServer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//
//    @Autowired
//    private UserService userDetailsService;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    private Logger logger = Logger.getLogger(Authentication.class.getName());
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//        UserDetails u = userDetailsService.loadUserByUsername(username);
//
//        if(passwordEncoder.matches(password, u.getPassword())){
//            logger.info("good");
//            return new UsernamePasswordAuthenticationToken(
//                    username,
//                    password,
//                    u.getAuthorities()
//            );
//        } else {
//            logger.info("bad");
//            throw new BadCredentialsException("Something was wrong");
//        }
//
//
//    }
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(aClass);
//    }
//}
