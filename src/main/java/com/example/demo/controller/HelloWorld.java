package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "测试")
@RestController
public class HelloWorld {

    @Resource
    private RedisTemplate redisTemplate;

    @GetMapping("/hello")
    @ResponseBody()
    public String sayHello() {
        System.out.println(redisTemplate.opsForValue().get("second"));
        return "hello";
    }
}
