package com.lixiuchun.util;


import com.lixiuchun.bean.User;

public class UserFactory {


    public static User createUser(){
        return new User();
    }

    /**
     * 实例工厂配置
     * @return
     */
    public User createUser2(){
        return new User();
    }
}
