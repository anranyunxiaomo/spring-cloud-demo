package com.moxuan.cloud.consumer.order.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ProjectName dxyt-mdm
 * @ClassName loadBalancer
 * @Author zhangkai
 * @Description
 * @Date 2020/3/21 8:02 下午
 */
public interface LadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
