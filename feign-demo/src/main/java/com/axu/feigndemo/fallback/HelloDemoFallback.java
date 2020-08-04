package com.axu.feigndemo.fallback;

import com.axu.feigndemo.model.User;
import com.axu.feigndemo.service.HelloDemoService;

/**
 * @ClassName HelloDemoFallback
 * @Description 当HelloDemoService 中的请求出错或者降级的时候就会走 这边的fallback 方法
 * @Author Axu
 * @Date 2020/8/2 22:10
 * @Version 1.0
 */
public class HelloDemoFallback implements HelloDemoService {
    @Override
    public Object getUser() {
        return "降级了";
    }

    @Override
    public User getByUser(String id) {
        User user = new User();
        user.setAge("-1");
        user.setId(-1);
        user.setName("异常");

        return user;
    }

    @Override
    public int addOrder(String id) {
        return 0;
    }

    @Override
    public int addUser(String id) {
        return 0;
    }
}
