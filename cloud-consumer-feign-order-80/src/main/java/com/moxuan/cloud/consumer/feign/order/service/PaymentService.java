package com.moxuan.cloud.consumer.feign.order.service;

import com.moxuan.common.entity.Payment;
import com.moxuan.common.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentService
 * @Author zhangkai
 * @Description
 * @Date 2020/3/21 9:55 下午
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentService {

    @GetMapping("/payment/select/{id}")
     CommonResult select( @PathVariable(name = "id") Long id);

    @GetMapping("/payment/get")
     String payment();
}
