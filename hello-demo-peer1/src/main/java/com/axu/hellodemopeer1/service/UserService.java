package com.axu.hellodemopeer1.service;

import com.axu.hellodemopeer1.dao.UserDao;
import com.axu.hellodemopeer1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUser() {
        return userDao.getUser();
    }

}
