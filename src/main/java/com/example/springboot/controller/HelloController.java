package com.example.springboot.controller;

import com.example.springboot.pojo.IMoocJSONResult;
import com.example.springboot.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!sss";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){
        Resource re = new Resource();
        BeanUtils.copyProperties(resource,re);
        return IMoocJSONResult.ok(re);
    }
}