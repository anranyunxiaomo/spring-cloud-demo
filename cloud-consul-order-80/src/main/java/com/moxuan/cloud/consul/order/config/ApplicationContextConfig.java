package com.moxuan.cloud.consul.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ApplicationContextConfig
 * @Author zhangkai
 * @Description
 * @Date 2020/3/17 9:14 下午
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  //轮询 负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
