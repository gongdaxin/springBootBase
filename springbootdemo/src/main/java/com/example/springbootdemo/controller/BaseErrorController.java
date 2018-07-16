package com.example.springbootdemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseErrorController implements ErrorController{

    private static final Logger log = LogManager.getLogger(BaseErrorController.class);

    @Override
    @RequestMapping
    public String getErrorPath() {
        log.info("enter error page");
        return "/error/error";
    }

}
