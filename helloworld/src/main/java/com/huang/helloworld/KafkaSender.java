package com.huang.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 黄世增
 */

@Component
public class KafkaSender {

    private final KafkaTemplate kafkaTemplate;


    @Autowired
    public KafkaSender(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, String message) {
        kafkaTemplate.send(topic, message);
        System.out.println("topic: " + topic + ", message: " + message);
    }
}
