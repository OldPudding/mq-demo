package com.example.topicexchange;

import com.example.topicexchange.producer.TopicSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TopicExchangeApplicationTests {
    @Autowired
    private TopicSender topicSender;

    @Test
    void contextLoads() {
        topicSender.send1();
    }

    @Test
    void send2(){
        topicSender.send2();
    }


}
