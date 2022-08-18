package com.lixiuchun.test;


import com.lixiuchun.bean.CollectionDemo;
import com.lixiuchun.bean.Person;
import com.lixiuchun.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickTest {


    @Test
    public void testFn(){
        //1、加载配置文件 classpath: Spring与SpringMVC加载核心配置文件要用到 ,核心配置文件不需要一定放于src的根目录
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2、使用应用上下文对象调用getBean方法，获取Spring容器中已经配置好的实体对象
        User user = (User)applicationContext.getBean("user");

        User uUser = (User)applicationContext.getBean("u1");
        System.out.println(uUser);
    }
    /**
     * 面试题：对Spring容器中的某一个bean获取多次，获取的对象是否为同一个？
     */
    @Test
    public void testFn1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        User a1 = (User)applicationContext.getBean("a1");

        User a2 = (User)applicationContext.getBean("a2");
        System.out.println(a1 == a2);//地址 ： 若是单例肯定相同

        System.out.println("---------------------");

        User user1 = (User)applicationContext.getBean("user");

        User user2 = (User)applicationContext.getBean("user");

        System.out.println(user1 == user2);
    }


    @Test
    public void testFn2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        User u1 = (User)applicationContext.getBean("u1");

        System.out.println(u1);

        applicationContext.close();//主动关闭容器，实体会调用destroy-method配置的destroy方法
    }

    @Test
    public void testFn3(){
        //只要一加载配置文件，里面的所有实体对象就会被创建了，配置了init-method 的方法就会被调用
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        User user = (User)applicationContext.getBean("user3");

        System.out.println(user);
    }

    @Test
    public void testFn4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Person person = (Person)applicationContext.getBean("person");

        System.out.println(person);
    }

    @Test
    public void testFn5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Person person = (Person)applicationContext.getBean("p1");

        System.out.println(person);
    }

    @Test
    public void testFn6(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        CollectionDemo cd = (CollectionDemo)applicationContext.getBean("collectionDemo");

        System.out.println(cd);
    }

}
