package com.moxuam.cloud.provider.hystrix.payment.service.impl;

import com.moxuam.cloud.provider.hystrix.payment.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
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
    public String payment_info_ok(Integer id){
        return "线程池："+Thread.currentThread().getName()+"  payment_info_ok  "+id+"    ok";
    }

    @Override
    @HystrixCommand(fallbackMethod = "payment_info_errorHandler",
            commandProperties ={@HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds" ,value = "3000")} )
    public String payment_info_error(Integer id){
        int age=10/0;
        //int timeNumber=5;
//        try {
//            TimeUnit.SECONDS.sleep(timeNumber);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "线程池："+Thread.currentThread().getName()+"  payment_info_error  "+age+" 耗时";
    }
    public String payment_info_errorHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"  payment_info_errorHandler  "+id+"啦啦啦 ";
    }
}
