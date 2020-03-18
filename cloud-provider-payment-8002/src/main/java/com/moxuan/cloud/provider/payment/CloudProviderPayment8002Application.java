package com.moxuan.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author xuan
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudProviderPayment8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002Application.class, args);
    }
}
