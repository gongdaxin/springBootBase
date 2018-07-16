package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private static final Logger log = LogManager.getLogger(HelloController.class);

    @Value(value = "${radom.num}")
    private String radom;

    @Value(value = "${radom.int}")
    private String randomNum;

    @Value(value = "${boot.desc}")
    private String desc;

    @RequestMapping("Hello")
    public String  Hello(){
        log.info("enter the method : Hello");
        return "hello,this is a springboot demo";
    }

    @RequestMapping(value = "get")
    public Map<String,String> get(@RequestParam String name){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name",name);
        map.put("value","hello,this is a springboot demo");
        map.put("radom",radom);
        map.put("num",randomNum);
        map.put("desc",desc);
        return map;
    }

    @RequestMapping(value = "get1")
    public Map<String,String> get1(@RequestParam String name){
        Map<String,String> map = new HashMap<String,String>();
        map.put("name",name);
        map.put("value","hello,this is a springboot demo");

        return map;
    }

    @RequestMapping(value = "getStudent/{id}/{name}")
    public Student getStudent(@PathVariable String id ,@PathVariable String name){
        Student st = new Student();
        st.setId(id);
        st.setName(name);
        st.setCurrentDate(new Date());
        System.out.println(new Date());
        return st;
    }
}
