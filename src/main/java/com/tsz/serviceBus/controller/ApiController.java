package com.tsz.serviceBus.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @RequestMapping({"/", ""})
    public Object index() {
        return "测试的顺利";
    }

    @GetMapping("/list")
    public String hello() {
        return "hello world";
    }
}
