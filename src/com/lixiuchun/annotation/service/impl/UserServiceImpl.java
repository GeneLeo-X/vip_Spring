package com.lixiuchun.annotation.service.impl;


import com.lixiuchun.annotation.User;
import com.lixiuchun.annotation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(User user) {
        System.out.println("添加用户操作!");
    }
}
