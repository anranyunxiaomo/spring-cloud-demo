package com.moxuan.cloud.alibaba.consumer.nacos.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudAlibabaConsumerNacosOrder83Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 9:44 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConsumerNacosOrder83Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumerNacosOrder83Application.class,args);
    }
}
