package com.example.directexchange.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("直接路由交换机");
    }

    @Bean
    Binding bindingExchangeMessage(Queue helloQueue, DirectExchange exchange) {
        return BindingBuilder.bind(helloQueue).to(exchange)
                .with("hello-q");
    }
}
