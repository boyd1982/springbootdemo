package com.example.springbootdemo.controllers;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class DemoController {
    @Autowired
    private UserService userService = null;
//    查询多个结果
    @GetMapping("/users")
    public List<User> Users(){
        return userService.getUsers();
    }
//    查询单个结果
    @GetMapping(value = "/user/{id}")
    public User UserbyID(@PathVariable("id") Long id){
        return userService.getUserbyID(id);
    }
//    一对多连表查询
    @GetMapping(value = "/userchoices/{id}")
    public User UserChoices(@PathVariable("id") Long id){
        User res = userService.getChoicesbyID(id);
        return res;
    }
}
