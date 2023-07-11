package com.demo.customer.events;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class Producer {
    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> kafkaTemplate.send("topic-example1", "hello kafka");
    }
}
