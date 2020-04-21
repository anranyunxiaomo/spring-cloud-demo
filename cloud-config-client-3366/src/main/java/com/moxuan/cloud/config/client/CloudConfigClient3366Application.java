package com.moxuan.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudConfigClient3366Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/21 7:54 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigClient3366Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient3366Application.class,args);
    }
}
