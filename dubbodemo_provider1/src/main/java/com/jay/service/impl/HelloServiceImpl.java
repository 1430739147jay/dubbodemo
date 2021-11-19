package com.jay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jay.service.HelloService;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author jay
 * @date 2021/10/11 - 1:52
 */
@Service//是dubbo框架 提供的注解，用于发布指定的服务到注册中心（zookeeper）
@Transactional
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String name) {
        System.out.print("现在打开的是8089");
        return "8089hello"+name;
    }
}
