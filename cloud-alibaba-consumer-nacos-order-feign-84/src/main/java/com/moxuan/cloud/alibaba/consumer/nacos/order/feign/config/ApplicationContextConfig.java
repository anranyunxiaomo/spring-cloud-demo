package com.moxuan.cloud.alibaba.consumer.nacos.order.feign.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ApplicationContextConfig
 * @Author zhangkai
 * @Description
 * @Date 2020/6/21 2:17 下午
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
