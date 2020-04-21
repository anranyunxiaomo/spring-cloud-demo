package com.moxuan.cloud.stream.rabbitmq.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudStreamRabbitmqProvider8801Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/21 9:25 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudStreamRabbitmqProvider8801Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqProvider8801Application.class,args);
    }
}
