package com.HTech.deliveryapp.Services;

import com.HTech.deliveryapp.Configurtions.Appconstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Kafkaservice {
    private static final Logger log = LoggerFactory.getLogger(Kafkaservice.class);
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public boolean updateLocation(String location){

            kafkaTemplate.send(Appconstants.LOCATION_TOPIC_NAME,location);
            log.info("message  produced  ");

        return true;
    }
}
