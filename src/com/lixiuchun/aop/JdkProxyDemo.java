package com.lixiuchun.aop;



import com.lixiuchun.aop.service.OrderService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class JdkProxyDemo implements InvocationHandler{

    OrderService orderService;

    public OrderService getProxyOS(OrderService orderService){
        this.orderService = orderService;

        return  (OrderService)Proxy.newProxyInstance(orderService.getClass().getClassLoader() , orderService.getClass().getInterfaces() , this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理前...");
        //obj : 被代理方法的返回值
        Object obj = method.invoke(orderService, args);
        System.out.println("JDK动态代理后...");
        return obj;
    }
}
