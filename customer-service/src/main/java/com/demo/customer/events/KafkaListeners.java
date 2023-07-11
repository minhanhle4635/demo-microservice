package com.demo.customer.events;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "topic-example1",
            groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
