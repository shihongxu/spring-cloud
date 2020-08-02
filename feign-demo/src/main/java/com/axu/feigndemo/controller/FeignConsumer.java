package com.axu.feigndemo.controller;

import com.axu.feigndemo.model.User;
import com.axu.feigndemo.service.HelloDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FeignController
 * @Description TODO
 * @Author Axu
 * @Date 2020/8/2 22:17
 * @Version 1.0
 */
@RestController
public class FeignConsumer {
    @Autowired
    HelloDemoService helloDemoService;

    @GetMapping("/getUser")
    public User getUser(){
        return (User) helloDemoService.getUser();
    }

    @GetMapping("/find-user")
    public Object findTeacher(){
        return helloDemoService.getUser();
    }

    @GetMapping("/find-by-user")
    public User getTeacher(@RequestParam(value ="id")String id){
        return helloDemoService.getByUser(id);}
}
