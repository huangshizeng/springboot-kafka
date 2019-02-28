package com.huang.helloworld;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author 黄世增
 */

@Component
public class KafkaReceiver {

    @KafkaListener(topics = {"test-topic"})
    public void processMessage(String content) {
        System.out.println("消息被消费" + content);
    }
}
