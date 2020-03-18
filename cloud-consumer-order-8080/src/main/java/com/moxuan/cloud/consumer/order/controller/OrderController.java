package com.moxuan.cloud.consumer.order.controller;

import com.moxuan.common.entity.PaymentAddDTO;
import com.moxuan.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName dxyt-mdm
 * @ClassName OrderController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/17 9:16 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_ADD_POST="http://localhost:8081";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult add(PaymentAddDTO paymentAddDTO){
      return   restTemplate.postForObject(PAYMENT_ADD_POST+"/payment/add",paymentAddDTO,CommonResult.class);
    }

    @GetMapping("/select/{id}")
    public CommonResult select(@PathVariable("id")long id){
        return restTemplate.getForObject(PAYMENT_ADD_POST+"/payment/select/"+id,CommonResult.class);
    }
}
