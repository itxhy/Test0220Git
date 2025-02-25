package com.itxhy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Test01Controller {
    @RequestMapping("/testHi")
    public String testHello(){
        return  "hii gitHub";
    }

    @RequestMapping(value = "/getAge",method = RequestMethod.GET)
    public void getAge(){

    }
}
