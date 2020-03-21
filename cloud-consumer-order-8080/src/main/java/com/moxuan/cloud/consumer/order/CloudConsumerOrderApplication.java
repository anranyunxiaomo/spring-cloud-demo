package com.moxuan.cloud.consumer.order;

import com.moxuan.cloud.consumer.myself.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;


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
