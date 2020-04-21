package com.moxuan.cloud.stream.rabbitmq.provider.service.impl;

import com.moxuan.cloud.stream.rabbitmq.provider.service.IMessageProviderService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ProjectName dxyt-mdm
 * @ClassName IMessageProviderServiceImpl
 * @Author zhangkai
 * @Description
 * @Date 2020/4/21 9:43 下午
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class IMessageProviderServiceImpl implements IMessageProviderService {

    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        Message<String> message = MessageBuilder
                .withPayload(serial).
                build();
        output.send(message);
        System.out.println("*******serial"+serial);
        return serial;
    }
}
