package com.moxuan.cloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author xuan
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentApplication.class, args);
    }
}
