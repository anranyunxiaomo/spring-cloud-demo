package com.moxuan.cloud.stream.rabbitmq.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ReadMessgeController
 * @Author zhangkai
 * @Description
 * @Date 2020/4/21 10:55 下午
 */
@Component
@EnableBinding(Sink.class)
public class ReadMessageController {
    @Value("${server.port}")
    private String servicePort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者——+"+servicePort+"接收到的消息"+message.getPayload());
    }

}
