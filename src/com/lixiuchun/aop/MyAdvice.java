package com.lixiuchun.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 自定义通知类
 * 1、前置通知
 * 2、后置通知
 * 3、异常通知
 * 4、环绕通知
 * 5、最终通知
 *
 * 切面
 *
 * @Aspect ： 注解版配置AOP时使用，该注解标记一个类为切面
 * @Before : 前置通知
 * @AfterReturning : 正常运行后通知
 *
 * @Pointcut : 切点表达式配置
 *
 * AOP配置方式，更推荐于使用XML配置文件的方式。
 */

@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.lovecoding.aop.service.impl.*ServiceImpl.*(..))")
    public void pc(){}

    /**
     * 前置通知
     */
    @Before("MyAdvice.pc()")
    public void beforeAdvice(){
        System.out.println("增强方法执行前的通知....");
    }

    /**
     * 后置通知：若增强的方法中存在异常，则后置通知失效
     */
    @AfterReturning("MyAdvice.pc()")
    public void afterAdvice(){
        System.out.println("增强方法执行后的通知....");
    }

    /**
     * 异常通知：被增强的方法中出现了异常情况下，就会调用该通知
     */
    public void afterThrowingAdvice(){
        System.out.println("增强方法中出现异常调用....");
    }

    /**
     * 环绕通知：被增强的方法，前后加入通知
     */
    public void aroundAdvice(ProceedingJoinPoint pjp){

        try {
            System.out.println("环绕前通知...");
            pjp.proceed();
            System.out.println("环绕后通知...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * 最终通知：无论被增强方法中是否出现异常都会执行的方法。
     * 与异常捕获中的finally代码块很像
     */
    public void finalAdvice(){
        System.out.println("最终通知....");
    }

}
