package com.moxuan.cloud.alibaba.sentinel.service.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.moxuan.cloud.alibaba.sentinel.service.handler.BlockHandler;
import com.moxuan.common.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName dxyt-mdm
 * @ClassName RateController
 * @Author zhangkai
 * @Description
 * @Date 2020/5/2 8:31 下午
 */
@RestController
public class RateController {

    @GetMapping("/by/resource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource(){
        return new CommonResult(200,"成功");
    }

    public CommonResult handleException(BlockException blockException){
        return new CommonResult(400,blockException.getClass().getCanonicalName()+"-----");
    }

    @GetMapping("/rateLimit/blockHandler")
    @SentinelResource(value = "blockHandler",blockHandlerClass = BlockHandler.class,blockHandler = "handleException")
    public CommonResult blockHandler(){
        return new CommonResult(200,"自定义成功");
    }
}
