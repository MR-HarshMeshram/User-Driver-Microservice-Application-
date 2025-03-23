package com.HTech.enduserapp.Controllers;

import com.HTech.enduserapp.Configuration.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LocationController {
    @Autowired
    private  KafkaConfig kafkaConfig;
//    @GetMapping
//    public ResponseEntity<?> getlocation(){
//       return new ResponseEntity<>();
//
//    }
}
