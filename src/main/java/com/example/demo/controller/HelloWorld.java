package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试")
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    @ResponseBody()
    public String sayHello() {
        return "hello";
    }
}
