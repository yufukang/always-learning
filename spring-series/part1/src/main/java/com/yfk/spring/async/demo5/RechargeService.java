package com.yfk.spring.async.demo5;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class RechargeService {
    //模拟异步充值
    @Async(MainConfig5.RECHARGE_EXECUTORS_BEAN_NAME)
    public void recharge() {
        System.out.println(Thread.currentThread() + "模拟异步充值");
    }
}
