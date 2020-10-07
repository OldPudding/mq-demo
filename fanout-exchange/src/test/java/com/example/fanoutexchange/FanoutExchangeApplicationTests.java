package com.example.fanoutexchange;

import com.example.fanoutexchange.producer.fanoutSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FanoutExchangeApplicationTests {
    @Autowired
    private fanoutSender fanoutSender;

    @Test
    void contextLoads() {
        fanoutSender.sendMessage();
    }

}
