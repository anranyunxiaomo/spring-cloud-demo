package com.moxuan.cloud.alibaba.consumer.nacos.order.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudAlibabaConsumerNacosOrderFeign84Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 9:44 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaConsumerNacosOrderFeign84Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumerNacosOrderFeign84Application.class,args);
    }
}
