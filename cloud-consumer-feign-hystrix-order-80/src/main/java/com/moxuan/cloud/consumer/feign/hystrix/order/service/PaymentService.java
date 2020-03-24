package com.moxuan.cloud.consumer.feign.hystrix.order.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentService
 * @Author zhangkai
 * @Description
 * @Date 2020/3/24 8:34 下午
 */
@Component
public class PaymentService implements OrderService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "OrderService paymentInfoOk------";
    }

    @Override
    public String paymentInfoError(Integer id) {
        return "OrderService paymentInfoError ----";
    }

    @Override
    public String paymentCircuitBreaker(Integer id) {
        return null;
    }
}
