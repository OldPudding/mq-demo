package com.example.fanoutexchange.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class fanoutSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendMessage() {
        String context = "hi, all fans, are you ready??";
        System.out.println("发送队列消息 : " + context);
        this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
    }
}
