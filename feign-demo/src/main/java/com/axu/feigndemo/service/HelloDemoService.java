package com.axu.feigndemo.service;

import com.axu.feigndemo.fallback.HelloDemoFallback;
import com.axu.feigndemo.model.User;
import feign.Body;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name="HELLOCLIENT", fallback = HelloDemoFallback.class)
public interface HelloDemoService {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Object getUser();

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getByUser(@RequestParam("id")String id);

    @Body("%7B\"id\": \"{id}\"%7D")
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int addOrder(@Param("id")String id);

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public int addUser(@Param("id")String id);



}
