package com.lixiuchun.aop.service.impl;


import com.lixiuchun.aop.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void add() {
        System.out.println("添加订单");
        int i = 10/ 0;
    }

    @Override
    public void delete() {
        System.out.println("删除订单");
    }

    @Override
    public void update(Integer id) {
        System.out.println("更新订单");
    }
}
