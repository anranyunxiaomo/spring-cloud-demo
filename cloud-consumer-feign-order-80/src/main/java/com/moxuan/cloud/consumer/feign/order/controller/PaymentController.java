package com.moxuan.cloud.consumer.feign.order.controller;

import com.moxuan.cloud.consumer.feign.order.service.PaymentService;
import com.moxuan.common.result.CommonResult;
import feign.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/21 10:00 下午
 */
@RestController
@RequestMapping("/order")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/get/{id}")
    public CommonResult select(@PathVariable("id")long id){
        return paymentService.select(id);
    }
    @GetMapping("/payment/select")
    public String payment(){
        return paymentService.payment();
    }

}
