package com.example.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "fruit", groupId = "devbeekei2")
    public void consume(String message) {
        System.out.printf("Consumed message : %s%n", message);
    }

}
