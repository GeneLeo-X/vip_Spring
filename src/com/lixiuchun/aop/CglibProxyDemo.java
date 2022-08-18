package com.lixiuchun.aop;


import com.lixiuchun.aop.service.OrderService;
import com.lixiuchun.aop.service.impl.OrderServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyDemo implements MethodInterceptor {


    public OrderService getProxyOS(){
        Enhancer en = new Enhancer();
        en.setSuperclass(OrderServiceImpl.class);//设置父类
        en.setCallback(this);//设置回调
        return (OrderService)en.create();//返回被代理后的对象
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB代理前....");
        Object object = methodProxy.invokeSuper(obj , args);
        System.out.println("CGLIB代理后....");
        return object;
    }
}
