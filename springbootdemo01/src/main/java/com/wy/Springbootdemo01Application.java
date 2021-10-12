package com.wy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot 项目是为了简化ssm项目而存在的
//ssm 项目配置比较繁琐，比如，需要配置Tomcat， 需要很多的xml 去配置 第三方依赖
//而 springboot 简化成 ，该内置的就内置，多个xml配置改为 一个 properties/xml 文件
//说白了 就是ssm  只不过写起来简单了
@SpringBootApplication      //springboot 应用注解，标记 本项目是 springboot项目，必须要有这个注解！！！
@MapperScan("com.wy.dao")   //持久层的dao 包扫描
public class Springbootdemo01Application {
    //main方法，项目一启动就会执行该方法
    public static void main(String[] args) {
        //静态的调用 SpringApplication 应用， 参数为，本项目的 启动类。
        System.out.println("springboot  该项目启动了");
        SpringApplication.run(Springbootdemo01Application.class, args);
    }

}
