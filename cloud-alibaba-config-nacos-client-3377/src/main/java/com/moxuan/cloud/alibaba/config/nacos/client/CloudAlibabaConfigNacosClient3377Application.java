package com.moxuan.cloud.alibaba.config.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudAlibabaConfigNacosClient3377Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 10:17 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConfigNacosClient3377Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConfigNacosClient3377Application.class,args);
    }
}
