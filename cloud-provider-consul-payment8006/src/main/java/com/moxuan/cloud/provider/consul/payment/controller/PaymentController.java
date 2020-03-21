package com.moxuan.cloud.provider.consul.payment.controller;

import com.moxuan.common.result.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/19 8:27 下午
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/discovery")
    public Object discovery(){
        System.out.println(serverPort.toString());
        // 获取所有在注册服务的信息的列表
        List<String> serviceList = discoveryClient.getServices();
        System.out.println(serviceList.toString());
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("provider-consul-payment");
        System.out.println(serviceInstanceList.toString());
        return  new CommonResult(1,"成功",serviceInstanceList);
    }

}
