package com.moxuan.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ConfigClientController
 * @Author zhangkai
 * @Description
 * @Date 2020/4/14 9:48 下午
 */
@RefreshScope // 刷新配置
@RestController
public class ConfigClientController {

   @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
