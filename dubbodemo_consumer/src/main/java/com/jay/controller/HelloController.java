package com.jay.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.jay.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jay
 * @date 2021/10/11 - 17:21
 */

@RestController//等价于@Controller+@ResponseBody
@RequestMapping("/demo")
public class HelloController {
    //@Autowired//从当前应用Ioc容器中注入bean对象
    @Reference//默认是random//引用远程服务对象（从zookeeper中订阅服务），进行远程调用
    HelloService helloService;
    @RequestMapping("/hello")
    public String sayHello(String name){
        String s = helloService.sayHello(name);
        return s;
    }
}
