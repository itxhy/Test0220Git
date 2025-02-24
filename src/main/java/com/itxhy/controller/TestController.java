package com.itxhy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @RequestMapping("/testHello")
    public String testHello(){
        return  "Hello gitHub";
    }
}
