package com.example.directexchange;

import com.example.directexchange.producer.HelloSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DirectExchangeApplicationTests {
    @Autowired
    private HelloSender helloSender;

    @Test
    void contextLoads() {
        helloSender.send();
    }

}
