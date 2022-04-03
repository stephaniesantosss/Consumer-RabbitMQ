package com.example.spring.consumer.broker;

public interface AmqpConsumer<T> {

    void consumer(T t);
}
