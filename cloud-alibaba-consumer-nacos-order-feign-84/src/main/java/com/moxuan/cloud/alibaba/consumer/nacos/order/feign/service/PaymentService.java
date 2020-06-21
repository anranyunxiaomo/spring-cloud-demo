package com.moxuan.cloud.alibaba.consumer.nacos.order.feign.service;

import com.moxuan.cloud.alibaba.consumer.nacos.order.feign.service.impl.PaymentServiceImpl;
import com.moxuan.common.result.CommonResult;
import io.micrometer.core.instrument.Meter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentService
 * @Author zhangkai
 * @Description
 * @Date 2020/6/21 3:19 下午
 */
@FeignClient(value = "nacos-payment-prvovider",fallback = PaymentServiceImpl.class)
public interface PaymentService {

    @GetMapping(value = "/payment/{id}")
     CommonResult payment(@PathVariable("id") Long id );
}
