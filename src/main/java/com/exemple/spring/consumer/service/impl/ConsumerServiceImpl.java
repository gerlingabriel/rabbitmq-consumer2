package com.exemple.spring.consumer.service.impl;

import org.springframework.stereotype.Service;

import com.exemple.spring.consumer.dto.Message;
import com.exemple.spring.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService{

    @Override
    public void action(Message msn) {
        System.out.println(msn.getText());    
    }
    
}
