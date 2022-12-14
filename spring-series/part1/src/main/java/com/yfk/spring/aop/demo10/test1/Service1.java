package com.yfk.spring.aop.demo10.test1;

public class Service1 {
    public String say(String name) {
        return "你好：" + name;
    }

    public String work(String name) {
        return "开始工作了：" + name;
    }

    public boolean login(String name) {
        if (!"spring aop".equals(name)) {
            throw new IllegalArgumentException("非法访问!");
        }
        return true;
    }
}
