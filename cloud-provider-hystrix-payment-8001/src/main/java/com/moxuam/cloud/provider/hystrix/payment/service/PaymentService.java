package com.moxuam.cloud.provider.hystrix.payment.service;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentService
 * @Author zhangkai
 * @Description
 * @Date 2020/3/23 8:48 下午
 */
public interface PaymentService {

     String payment_info_ok(Integer id);

     String payment_info_error(Integer id);

     String paymentCircuitBreaker(Integer id);

}
