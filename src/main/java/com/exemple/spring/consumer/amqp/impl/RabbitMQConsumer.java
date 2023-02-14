package com.exemple.spring.consumer.amqp.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.exemple.spring.consumer.amqp.AmqpConsumer;
import com.exemple.spring.consumer.dto.Message;
import com.exemple.spring.consumer.service.ConsumerService;

@Component
public class RabbitMQConsumer implements AmqpConsumer<Message>{

    @Autowired
    private ConsumerService consumerService;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.routing-key.producer}")
    public void consumer(Message msn) {
        consumerService.action(msn);   
    }
    
}
