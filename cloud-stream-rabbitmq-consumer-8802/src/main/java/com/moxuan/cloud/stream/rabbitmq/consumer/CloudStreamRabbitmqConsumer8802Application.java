package com.moxuan.cloud.stream.rabbitmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudStreamRabbitmqConsumer8802Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/21 9:25 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudStreamRabbitmqConsumer8802Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqConsumer8802Application.class,args);
    }
}
