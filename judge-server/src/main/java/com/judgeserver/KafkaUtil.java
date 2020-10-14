package com.judgeserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class KafkaUtil {
    private final KafkaTemplate kafkaTemplate;

    @Autowired
    public KafkaUtil(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "code-event")
    public void processMessage(String content) {
        System.out.println("Receive a new event : " + content);
    }
}
