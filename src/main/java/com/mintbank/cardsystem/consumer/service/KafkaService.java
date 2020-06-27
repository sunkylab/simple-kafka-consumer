package com.mintbank.cardsystem.consumer.service;


import com.mintbank.cardsystem.consumer.dto.Message;

public interface KafkaService {

    void consumeMessage(String message);
}
