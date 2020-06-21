package com.moxuan.cloud.alibaba.provider.payment.controller;

import com.moxuan.common.entity.Payment;
import com.moxuan.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/6/21 2:04 下午
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"assassadasdafasfaf11111"));
        hashMap.put(2L,new Payment(2L,"assassadasdafasfaf22222"));
        hashMap.put(3L,new Payment(3L,"assassadasdafasfaf33333"));
    }

    @GetMapping("/payment/{id}")
    public CommonResult payment(@PathVariable("id")long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> paymentCommonResult = new CommonResult<>(200, "222222222" + serverPort, payment);
        return paymentCommonResult;
    }


}
