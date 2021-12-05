package com.example.resourseServer.resourseServer.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Enumeration;
import java.util.logging.Logger;

@RestController
public class MainController {
    Logger logger = Logger.getLogger(MainController.class.getName());
    @GetMapping("/hello")
    public String hello(HttpServletResponse response, HttpServletRequest request,
                        OAuth2Authentication authentication){

        OAuth2AuthenticationDetails details =
                (OAuth2AuthenticationDetails) authentication.getDetails();


        return "Hello!" + details.getDecodedDetails()   ;
    }
}

