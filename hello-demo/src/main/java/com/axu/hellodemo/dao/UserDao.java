package com.axu.hellodemo.dao;

import com.axu.hellodemo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getUser(String id);
}