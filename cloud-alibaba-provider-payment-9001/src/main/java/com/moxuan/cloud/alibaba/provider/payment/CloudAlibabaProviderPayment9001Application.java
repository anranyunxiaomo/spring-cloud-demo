package com.moxuan.cloud.alibaba.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudAlibabaProviderPayment9001Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 9:18 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaProviderPayment9001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaProviderPayment9001Application.class,args);
    }
}
