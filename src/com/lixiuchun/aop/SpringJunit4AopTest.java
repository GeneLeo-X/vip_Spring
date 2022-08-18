package com.lixiuchun.aop;


import com.lixiuchun.aop.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/lixiuchun/aop/aop.xml")
public class SpringJunit4AopTest {



    @Autowired
    OrderService orderService;

    @Test
    public void testFn(){
        orderService.delete();
    }
}
