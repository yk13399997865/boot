package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @RequestMapping({"/",""})
    public Object index(){
        return "测试的顺利";
    }
}
