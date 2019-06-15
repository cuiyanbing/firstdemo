package com.cui.firstdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cui
 * @since 创建时间：2019/6/15 14:16
 */
@RestController
@RequestMapping("/cui")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello boot";
    }
}
