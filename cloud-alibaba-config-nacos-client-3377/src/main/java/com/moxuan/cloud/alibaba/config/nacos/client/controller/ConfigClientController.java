package com.moxuan.cloud.alibaba.config.nacos.client.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ConfigClientController
 * @Author zhangkai
 * @Description
 * @Date 2020/4/22 10:30 下午
 */
@RefreshScope // 支持nacos 的动态刷新
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }

}
