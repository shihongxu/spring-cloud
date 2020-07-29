package com.axu.hellodemo.controller;

import com.axu.hellodemo.entity.User;
import com.axu.hellodemo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Axu
 * @Date 2020/7/28 17:19
 * @Version 1.0
 */
@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/getuser")
    @ResponseBody
    public List<User> getUser(@Param("id") String id){

        List<User> userList = userService.getUser(id);

        System.out.println();
        return userList;
    }
}
