package com.moxuan.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudConfigCenter3344Application
 * @Author zhangkai
 * @Description
 * @Date 2020/4/14 8:49 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class CloudConfigCenter3344Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigCenter3344Application.class, args);
    }
}
