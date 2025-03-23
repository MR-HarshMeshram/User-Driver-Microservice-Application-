package com.HTech.deliveryapp.Controllers;

import com.HTech.deliveryapp.Services.Kafkaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private Kafkaservice kafkaservice;
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        this.kafkaservice.updateLocation("  ( " + Math.round(Math.random() * 100000) + " , "+Math.round(Math.random() * 100000)+ " )" );
        return  new ResponseEntity<>(Map.of(" message ","location update "), HttpStatus.OK);
    }
}