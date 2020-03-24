package com.moxuam.cloud.provider.hystrix.payment.controller;

import com.moxuam.cloud.provider.hystrix.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/23 8:45 下午
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        return paymentService.payment_info_ok(id);
    }
//    payment_info_error
    @GetMapping("/hystrix/error/{id}")
    public String paymentInfoError(@PathVariable("id")Integer id){
        return paymentService.payment_info_error(id);
    }
}
