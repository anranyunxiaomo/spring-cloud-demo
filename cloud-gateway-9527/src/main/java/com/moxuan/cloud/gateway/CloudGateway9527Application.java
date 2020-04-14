package com.moxuan.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudGateway9527Application
 * @Author zhangkai
 * @Description
 * @Date 2020/3/30 8:51 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudGateway9527Application {
        public static void main(String[] args) {
            SpringApplication.run(CloudGateway9527Application.class, args);
        }
}
