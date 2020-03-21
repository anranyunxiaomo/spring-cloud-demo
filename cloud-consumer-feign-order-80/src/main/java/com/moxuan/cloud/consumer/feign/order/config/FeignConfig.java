package com.moxuan.cloud.consumer.feign.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName dxyt-mdm
 * @ClassName FeignConfig
 * @Author zhangkai
 * @Description
 * @Date 2020/3/21 10:27 下午
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        // 全部日志信息
        return Logger.Level.FULL;
    }
}
