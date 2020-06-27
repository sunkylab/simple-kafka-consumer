package com.mintbank.cardsystem.consumer.service.implementation;


import com.mintbank.cardsystem.consumer.dto.Message;
import com.mintbank.cardsystem.consumer.service.KafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaServiceImpl implements KafkaService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaServiceImpl.class);

    @Override
    public void consumeMessage(String message) {
        logger.info("New Message received {}",message);
    }

    @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.groupId}")
    public void listen(String message) {
        this.consumeMessage(message);
    }
}
