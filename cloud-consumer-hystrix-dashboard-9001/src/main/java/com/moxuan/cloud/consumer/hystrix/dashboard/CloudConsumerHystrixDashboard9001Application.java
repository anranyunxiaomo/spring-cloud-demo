package com.moxuan.cloud.consumer.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CloudConsumerHystrixDashboard9001Appclication
 * @Author zhangkai
 * @Description
 * @Date 2020/3/25 9:16 下午
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard9001Application.class, args);
    }
}
