package com.example.spring.consumer.service.impl;

import com.example.spring.consumer.dto.Message;
import com.example.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override //throws Exception caso eu queira testar a dlq
    public void action(Message message) {
        //throw new Exception("Erro");
        System.out.println(message.getText());
    }
}
