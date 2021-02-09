package com.cmj.myCommunity.service;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    @PostConstruct // 该注解表示该方法再构造器之后调用，用来初始化某些数据
    public void init() {
        System.out.println("初始化AlphaService");
    }

    @PreDestroy // 该注解表示在销毁之前调用
    public void destory() {
        System.out.println("销毁AlphaService");
    }
}
