package com.test.patterns.structure.proxy;

import com.test.patterns.service.OrderService;
import com.test.patterns.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {

    //真实的订单服务
    private OrderService orderService = new OutOrderServiceImpl();

    @Override
    public int saveOrder() {

        //下单前添加操作
        System.out.println("添加下单前操作000");


        System.out.println("开始海外下订单111");
        return orderService.saveOrder();
    }
}
