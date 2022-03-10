package com.example.demo.business.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/test")
    public String test(){
        String str = "333测试接口成13331功";
        List<String> stringList = new ArrayList<>();
            return str;
    }
}
