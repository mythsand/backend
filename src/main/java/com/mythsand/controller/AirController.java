package com.mythsand.controller;

import com.mythsand.model.AirEntity;
import com.mythsand.model.CityEntity;
import com.mythsand.repository.AirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mythsand on 25/02/2017.
 */
@RestController
@RequestMapping("/air")
public class AirController {

    @Autowired
    AirRepository airRepository;

    @RequestMapping("/location/{location}")
    public ResponseEntity<?> getByLocation(@PathVariable("location") String location){
        System.out.println("location:"+location);
        List<AirEntity> airEntityList;
        airEntityList = airRepository.findAll();
        Map map = new HashMap();
        map.put("result",airEntityList);
        map.put("status","success");
        ResponseEntity responseEntity = new ResponseEntity<>(map, HttpStatus.OK);
        return responseEntity;
    }
}
