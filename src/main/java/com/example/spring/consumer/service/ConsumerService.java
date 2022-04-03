package com.example.spring.consumer.service;

import com.example.spring.consumer.dto.Message;

public interface ConsumerService {

    // caso eu queira testar a dlq => throws Exception
    void action(Message message);
}
