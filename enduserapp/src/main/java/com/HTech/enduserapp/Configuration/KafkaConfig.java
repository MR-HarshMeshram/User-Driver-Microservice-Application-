package com.HTech.enduserapp.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = Appconstant.LOCATION_UPDATE_TOPIC,groupId = Appconstant.GROUP_ID)
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
