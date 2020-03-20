package com.moxuan.cloud.consul.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author xuan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsulOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulOrder80Application.class, args);
    }
}
