package com.cn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/save")
    public String aa(){
        return"救命啊，我变成一条狗了！";
    }
}
