package com.example.fanoutexchange.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"queue3","queue4"})
public class fanoutReceiver {
    @RabbitHandler
    public void process(String message) {
        System.out.println("侦听到消息  : " + message);
    }
}
