package com.moxuan.cloud.consumer.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author xuan
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="cloud-payment-service",configuration = MyselfRule.class)
public class CloudConsumerOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderApplication.class, args);
    }
}
