package com.moxuan.cloud.consumer.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.Target;

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
   @LoadBalanced()  //轮询 负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
        //轮询(算法计算) 负载均衡
        // 以2个节点计算
        // 根据搭载的节点 作为一个list 存储好 对应节点的ip:port
        // 被调用的接口 第几次接口 % 服务集群总数  = 实际调动服务的下标位置  从1 开始
        // 1   % 2 (取余数)= 1 对应的list 下标位置为 1, 则会  list.get(1).获取服务器的地址信息.
        // 以此类推.
    }

}
