package com.example.fanoutexchange.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutConfig {
    /**
     * 创建队列
     * @returnp0o
     */
    @Bean
    public Queue queue1() {
        return new Queue("queue3");
    }

    /**
     * 创建队列
     * @return
     */
    @Bean
    public Queue queue2() {
        return new Queue("queue4");
    }

    /**
     * 将对列绑定到fanout交换器
     * @return
     */
    @Bean
    FanoutExchange exchange() {

        return new FanoutExchange("fanoutExchange");
    }


    @Bean
    Binding bindingExchangeA(Queue queue1, FanoutExchange exchange){
        return BindingBuilder.bind(queue1).to(exchange);
    }

    @Bean
    Binding bindingExchangeB(Queue queue2, FanoutExchange exchange){

        return BindingBuilder.bind(queue2).to(exchange);
    }

}
