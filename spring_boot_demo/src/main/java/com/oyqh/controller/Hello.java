package com.oyqh.controller;


import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by oyqh on 2017-2-4.
 */
@Service(version = "1.0.0")
public class Hello implements  IHello {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

    @Override
    public String sayYourAge(int age) {
        return null;
    }
}
