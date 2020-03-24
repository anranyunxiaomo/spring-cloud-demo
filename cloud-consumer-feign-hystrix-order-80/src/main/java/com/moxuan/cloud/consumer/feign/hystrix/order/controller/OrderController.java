package com.moxuan.cloud.consumer.feign.hystrix.order.controller;

import com.moxuan.cloud.consumer.feign.hystrix.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/23 10:01 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/info/ok/{id}")
    public String orderInfoOk(@PathVariable (value = "id")Integer id){
       return orderService.paymentInfoOk(id);
    }

    @GetMapping("/info/error/{id}")
    public String orderInfoError(@PathVariable (value = "id")Integer id){
        return orderService.paymentInfoError(id);
    }

}
