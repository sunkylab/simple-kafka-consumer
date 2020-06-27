package com.mintbank.cardsystem.consumer.dto;

import lombok.Data;

@Data
public class Message {

    private String scheme;
    private String type;
    private String bank;
}
