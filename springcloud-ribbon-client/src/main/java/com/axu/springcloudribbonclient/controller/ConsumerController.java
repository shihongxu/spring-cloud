package com.axu.springcloudribbonclient.controller;

import com.axu.springcloudribbonclient.command.CommandForIndex;
import com.axu.springcloudribbonclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author Axu
 * @Date 2020/7/30 10:18
 * @Version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public Object index(@RequestParam("id") String id){

        Object object = new Object();

        User user = (User)restTemplate.getForObject("http://helloclient/user/getuser?id="+id ,Object.class);
//        object = restTemplate.getForObject("http://localhost:8080/user/getuser?id=1" ,Object.class);
        User user1 =(User) new CommandForIndex(id, restTemplate).execute();

        return  user1;
    }
}
