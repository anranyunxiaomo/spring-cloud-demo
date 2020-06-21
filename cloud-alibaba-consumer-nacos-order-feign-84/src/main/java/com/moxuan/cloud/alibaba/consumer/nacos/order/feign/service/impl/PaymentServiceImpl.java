package com.moxuan.cloud.alibaba.consumer.nacos.order.feign.service.impl;

import com.moxuan.cloud.alibaba.consumer.nacos.order.feign.service.PaymentService;
import com.moxuan.common.entity.Payment;
import com.moxuan.common.result.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentServiceImpl
 * @Author zhangkai
 * @Description
 * @Date 2020/6/21 3:23 下午
 */
@Component
public class PaymentServiceImpl  implements PaymentService {

    @Override
    public CommonResult payment(Long id) {
        return new CommonResult(444,"服务降级返回，-----",new Payment(id,"xxxxxx"));
    }
}

