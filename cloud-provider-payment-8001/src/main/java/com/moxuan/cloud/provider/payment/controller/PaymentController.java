package com.moxuan.cloud.provider.payment.controller;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.moxuan.cloud.provider.payment.service.PaymentService;
import com.moxuan.common.entity.PaymentAddDTO;
import com.moxuan.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/16 10:13 下午
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;
    /**
     * @Method       add
     * @Author       zhangkai
     * @Description  添加
     * @param        paymentAddDTO
     * @Return       com.moxuan.common.module.result.CommonResult
     * @Exception
     * @Date         2020/3/16 10:29 下午
     */
    @PostMapping("/add")
    public CommonResult add(@RequestBody PaymentAddDTO paymentAddDTO){
        return paymentService.add(paymentAddDTO);
    }

    /**
     * @Method       select
     * @Author       zhangkai
     * @Description  查询
     * @param        id
     * @Return       com.moxuan.common.module.result.CommonResult
     * @Exception
     * @Date         2020/3/16 10:37 下午
     */
    @GetMapping("/select/{id}")
    public CommonResult select( @PathVariable(name = "id") Long id){
        System.out.println(serverPort);
        return paymentService.select(id);
    }

    @GetMapping(value = "/discovery")
    public Object discovery(){
        // 获取所有在注册服务的信息的列表
        List<String> serviceList = discoveryClient.getServices();
        System.out.println(serviceList.toString());
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("cloud-payment-service");
        System.out.println(serviceInstanceList.toString());
        return discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping("/get")
    public String payment(){
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return serverPort;
    }
}
