package com.moxuan.cloud.consumer.feign.hystrix.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudConsumerFeignHystrixOrder80
 * @Author zhangkai
 * @Description
 * @Date 2020/3/23 9:52 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class CloudConsumerFeignHystrixOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder80Application.class, args);
    }
}
