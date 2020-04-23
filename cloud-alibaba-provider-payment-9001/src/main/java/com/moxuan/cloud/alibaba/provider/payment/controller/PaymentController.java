package com.moxuan.cloud.alibaba.provider.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 9:30 下午
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id")Integer id){
        return "nacos ******"+serverPort+"*****id:"+id;
    }
}
