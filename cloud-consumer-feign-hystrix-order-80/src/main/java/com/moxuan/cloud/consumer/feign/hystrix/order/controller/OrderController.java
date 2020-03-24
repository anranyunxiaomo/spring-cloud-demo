package com.moxuan.cloud.consumer.feign.hystrix.order.controller;

import com.moxuan.cloud.consumer.feign.hystrix.order.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/23 10:01 下午
 */
@RestController
@RequestMapping("/order")
@DefaultProperties(defaultFallback = "payment_info_errorHandler")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/info/ok/{id}")
    public String orderInfoOk(@PathVariable (value = "id")Integer id){
       return orderService.paymentInfoOk(id);
    }

    @GetMapping("/info/error/{id}")
    @HystrixCommand
//    @HystrixCommand(fallbackMethod = "payment_info_errorHandler",
//            commandProperties ={ @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds" ,value = "1500")} )
    public String orderInfoError(@PathVariable (value = "id")Integer id){
        int age= 10/0;
        return orderService.paymentInfoError(id);
    }

    public String payment_info_errorHandler(){
        return "我是80 我调用8001 失败啦 请重新尝试连接。";
    }

}
