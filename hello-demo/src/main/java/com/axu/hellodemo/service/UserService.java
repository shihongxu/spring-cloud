package com.axu.hellodemo.service;

import com.axu.hellodemo.dao.UserDao;
import com.axu.hellodemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getUser(String id) {
        return userDao.getUser(id);
    }

}
