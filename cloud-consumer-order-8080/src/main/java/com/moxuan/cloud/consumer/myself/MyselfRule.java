package com.moxuan.cloud.consumer.myself;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName dxyt-mdm
 * @ClassName MyselfRule
 * @Author zhangkai
 * @Description
 * @Date 2020/3/20 8:24 下午
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        // 随机算法
        return new RandomRule();
        //
    }

}
