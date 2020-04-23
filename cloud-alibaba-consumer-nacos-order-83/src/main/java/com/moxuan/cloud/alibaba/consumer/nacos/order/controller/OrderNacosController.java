package com.moxuan.cloud.alibaba.consumer.nacos.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName dxyt-mdm
 * @ClassName OrderNacosController
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 9:51 下午
 */
@Slf4j
@RestController
public class OrderNacosController {
    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id")Integer id){
        return restTemplate.getForObject(serviceUrl+"/payment/nacos/"+id,String.class);
    }
}
