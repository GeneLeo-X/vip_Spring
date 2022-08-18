package com.lixiuchun.test;


import com.lixiuchun.bean.Person;
import com.lixiuchun.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    /**
     * 注解相关的测试
     */
    @Test
    public void testFn7(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:com/lovecoding/annotation/annotation.xml");

        User user = (User)applicationContext.getBean("user");

        User user1 = (User)applicationContext.getBean("user");

        System.out.println(user);


        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);

        /*Pig pig = (Pig)applicationContext.getBean("pig");
        System.out.println(pig);*/
    }
}
