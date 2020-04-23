package com.moxuan.cloud.alibaba.consumer.nacos.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ApplicationConfig
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 9:50 下午
 */
@Configuration
public class ApplicationConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
