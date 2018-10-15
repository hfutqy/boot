package com.qiyu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiyu on 2018/5/28.
 *
 * @RestController 是spring4里的新注解，是@ResponseBody和@Controller的缩写。
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/query")
    public String query() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/select")
    public String select() {
        return "Hello Spring Boot!";
    }


}
