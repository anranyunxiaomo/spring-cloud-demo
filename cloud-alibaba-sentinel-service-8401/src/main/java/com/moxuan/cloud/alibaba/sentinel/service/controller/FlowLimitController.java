package com.moxuan.cloud.alibaba.sentinel.service.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName dxyt-mdm
 * @ClassName FlowLimitController
 * @Author zhangkai
 * @Description
 * @Date 2020/5/2 3:31 下午
 */
@RestController
public class FlowLimitController {

@GetMapping("/testA")
    public String testA(){
    return "--------testA";
}
@GetMapping("/testB")
public String testB(){
    return "------testB";
}

    @GetMapping("/testC")
    public String testC(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "------testC";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false)String p1,
                              @RequestParam(value = "p2",required = false)String p2  ){
        {
            return "-------testHotKey";
        }
    }

    public String deal_testHotKey(String p1, String p2, BlockException blockException){
    return "----------deal_testHotKey--------";
    }

}
