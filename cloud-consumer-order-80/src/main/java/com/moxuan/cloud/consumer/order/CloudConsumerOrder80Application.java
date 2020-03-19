package com.moxuan.cloud.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author xuan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
    }
}
