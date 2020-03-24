package com.moxuan.cloud.consumer.feign.hystrix.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentService
 * @Author zhangkai
 * @Description
 * @Date 2020/3/23 9:57 下午
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentService.class)
public interface OrderService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id);

    //    payment_info_error
    @GetMapping("/payment/hystrix/error/{id}")
    public String paymentInfoError(@PathVariable("id") Integer id);

    @GetMapping("/payment/paymentCircuitBreaker/{id}")
    public String paymentCircuitBreaker(@PathVariable("id")Integer id);
}
