package com.moxuan.cloud.consumer.order.lb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ProjectName dxyt-mdm
 * @ClassName MyLB
 * @Author zhangkai
 * @Description
 * @Date 2020/3/21 8:05 下午
 */
@Component
public class MyLB implements LadBalancer {
    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current=atomicInteger.get();
            next=current>= 2147473647?0:current+1;
        }while (!atomicInteger.compareAndSet(current,next));
        System.out.println("next:"+next);
        return next;
    }

    private AtomicInteger atomicInteger =new AtomicInteger(0);
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstanceList) {
        int index = getAndIncrement()% serviceInstanceList.size();
        ServiceInstance serviceInstance = serviceInstanceList.get(index);
        return serviceInstance;
    }
}
