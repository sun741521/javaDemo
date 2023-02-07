package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
public class HelloWorld {

    @RequestMapping("/index")
    @ResponseBody()
    public String sayHello() {
        StringBuilder res = new StringBuilder();
        Logger logger = Logger.getGlobal();
        res.append("打印");
        logger.info("字符串：" + res);
        return "index";
    }
}
