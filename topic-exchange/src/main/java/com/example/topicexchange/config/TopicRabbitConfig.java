package com.example.topicexchange.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {
    final static String message = "topic.message";
    final static String messages = "topic.messages";

    /**
     * 创建队列
     * @returnp0o
     */
    @Bean
    public Queue queueMessage() {
        return new Queue(TopicRabbitConfig.message);
    }

    /**
     * 创建队列
     * @return
     */
    @Bean
    public Queue queueMessages() {
        return new Queue(TopicRabbitConfig.messages);
    }

    /**
     * 将对列绑定到Topic交换器
     * @return
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }

    /**
     * 将queueMessage队列绑定到Topic交换器并监听为topic.message的routingKey
     * 也就是说，当你发送消息时的key为topic.message的话，他就会被投递到queueMessage队列中，这个队列名字需要与上面声明的方法名相同
     *
     *     public Queue queueMessage() {
     *         return new Queue(TopicRabbitConfig.message);
     *     }
     *
     * @param queueMessage
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    /**
     * 将队列绑定到Topic交换器 采用#的方式,与上述方法类似，
     * 只是本处采用通配符。也就是说，所有以topic.开头的消息都会被投递到queueMessages队列中
     * @param queueMessages
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}

