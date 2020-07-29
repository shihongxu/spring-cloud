package com.axu.hellodemopeer1.dao;

import com.axu.hellodemopeer1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> getUser();
}