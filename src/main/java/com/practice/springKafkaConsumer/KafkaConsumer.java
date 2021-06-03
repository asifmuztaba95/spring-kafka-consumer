package com.practice.springKafkaConsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics= "kafka_test", groupId = "group_string")
    public void consume(String message){
        log.info("Consumed String messages: {}", message);
    }

    @KafkaListener(topics = "kafka_test_json", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
        log.info("Consumed JSON messages: {}", user);
    }
    
}
