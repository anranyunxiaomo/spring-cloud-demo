package com.moxuam.cloud.provider.hystrix.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class CloudProviderHystrixPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrixPayment8001Application.class, args);

    }
}
