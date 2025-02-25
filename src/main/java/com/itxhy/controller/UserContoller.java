package com.itxhy.controller;

import com.itxhy.data.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserContoller {
    @PostMapping("/add")
    public void addUser(){

    }
    @PostMapping("/add2")
    public void addUser2(){

    }
    @PostMapping("/update")
    public void updateUser(){

    }
    @DeleteMapping("/delete")
    public void deleteUser(){

    }
    @GetMapping("/find")
    public List<User> findUser(){

        return null;
    }
}
