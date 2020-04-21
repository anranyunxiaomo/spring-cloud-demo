package com.moxuan.cloud.stream.rabbitmq.provider.controller;

import com.moxuan.cloud.stream.rabbitmq.provider.service.IMessageProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName dxyt-mdm
 * @ClassName IMessageProviderController
 * @Author zhangkai
 * @Description
 * @Date 2020/4/21 9:42 下午
 */
@RestController
public class IMessageProviderController {

    @Resource
    private IMessageProviderService iMessageProviderService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return iMessageProviderService.send();
    }
}
