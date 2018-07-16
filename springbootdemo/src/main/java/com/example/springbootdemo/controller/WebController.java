package com.example.springbootdemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/web")
public class WebController {

    private static final Logger log = LogManager.getLogger(WebController.class);

    @RequestMapping(value = "/index")
    public String index(ModelMap map){

        log.info("enter WebController  method index");
        map.put("title","这是controller传过去的标题");
        // "/index" 在Windows下不会出现问题，但是在linux下会出现问题
        //默认会去 /resoures/templates目录下去寻找文件
        return "index";
    }

}
