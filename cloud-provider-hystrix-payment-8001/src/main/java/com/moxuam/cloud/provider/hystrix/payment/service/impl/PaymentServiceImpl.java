package com.moxuam.cloud.provider.hystrix.payment.service.impl;

import com.moxuam.cloud.provider.hystrix.payment.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.xml.ws.ServiceMode;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentServiceImpl
 * @Author zhangkai
 * @Description
 * @Date 2020/3/23 8:48 下午
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String payment_info_ok(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "  payment_info_ok  " + id + "    ok";
    }

    @Override
    @HystrixCommand(fallbackMethod = "payment_info_errorHandler",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
    public String payment_info_error(Integer id) {
        int age = 10 / 0;
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "  payment_info_error  " + age + " 耗时";
    }

    public String payment_info_errorHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "  payment_info_errorHandler+8001  " + id + "啦啦啦 ";
    }
    // 服务熔断
    @Override
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            // 请求次数
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            // 失败率多少以后跳闸
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("id 不能为负数");
        }
        String s = UUID.randomUUID().toString();
        return Thread.currentThread().getName() + "调用成功，流水号" + s;

    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id")Integer id){
        return "id 不能为负数 重新输入"+id;
    }
}
