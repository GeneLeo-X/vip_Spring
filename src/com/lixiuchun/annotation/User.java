package com.lixiuchun.annotation;


import com.lixiuchun.annotation.bean.Pig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @Component : 将一个实体类，配置于Spring容器中 ,该注解会默认实体名称 首字母小写。
 *          专门注解实体对象 - 和数据库对应的bean类 。自定义的中间条件类、查询类等
 * 针对于三层架构衍生出来三个对应的注解：
 *  @Controller : 1)可以将一个控制类注入到Spring容器中，2)且标记某一个类是控制层的类
 *  @Service : 注解service层下面的impl中的类 - 实现类 1）会将类注入到Spring大容器中，2) 标记该类为业务层的类
 *  @Repository : 注解dao层下面的。 1)会将类注入到Spring大容器中 2)标记该类为 数据访问层的类
 *
 *  @Scope(scopeName = "prototype") : 默认单例可以通过该方式修改为多例 。ssm架构、ssh架构 - struts2（多例需求）
 *
 *   @Value : 即是字段/属性 注入 - 破坏封装性（反射机制）
 *          set方式注入 ： 不会破坏封装
 *          由于set方法不美观、设置不方便 。 使用字段/属性 注入 居多。  - 推荐使用set方式注入
 *
 *   @Autowired : Spring中最常用的注解。 - 自动装配 会去Spring容器中找寻一个bean   Pig类首字母小写的
 *      1、若有两个/多个 bean 指向了一个实体类，自动装配会自动找寻名字为该实体首字母小写的名称的bean
 *      2、若存在多个实体bean，名字没有默认的 类首字母小写的就会报错。
 *      3、若多个bean，名称都不是首字母小写的，若还想自动装配需要与@Qualifier("p2") 组合使用来指定值。
 *      4、若实体类只有/仅有一个 bean存在时，无论名称是什么，都可以自动装配上。
 *   @Resource(name = "p1") : 相当于 @Autowired与@Qualifier("p2")组合注解
 *   @PostConstruct ： init方法配置的
 *   @PreDestroy ：销亡方法配置的
 */
@Component
public class User implements Serializable {

    @Value("wangwu123")
    private String username;

    @Value("123456")
    private String password;

    private Integer sex;

    private String email;


    //@Autowired
    //@Qualifier("p2")
    @Resource(name = "p1")
    private Pig pig;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public Pig getPig() {
        return pig;
    }

    public void setPig(Pig pig) {
        this.pig = pig;
    }

    /**
     * 2 - 男
     * @param sex
     */
    @Value("2")
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化参数使用...");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", pig=" + pig +
                '}';
    }
}
