package com.moxuan.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudConfigCenter3344Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/14 8:49 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigClient3355Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient3355Application.class, args);
    }
}
