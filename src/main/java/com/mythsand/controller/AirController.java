package com.mythsand.controller;

import com.mythsand.model.AirEntity;
import com.mythsand.repository.AirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mythsand on 25/02/2017.
 */
@RestController
@RequestMapping("/air")
public class AirController {

    @Autowired
    AirRepository airRepository;

    @RequestMapping("/airpoint/{airpoint}/{page}/{size}")
    public ResponseEntity<?> getByLocation(@PathVariable("airpoint") String airPoint, @PathVariable(value = "page") Integer page,@PathVariable("size") Integer size){
        System.out.println("AIR_POINT:"+airPoint);
        Sort sort = new Sort(Sort.Direction.DESC,"time");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<AirEntity> airEntityList;
        airEntityList =  airRepository.findByAirPoint(airPoint,pageable);
        Map map = new HashMap();
        map.put("result",airEntityList);
        map.put("status","success");
        ResponseEntity responseEntity = new ResponseEntity<>(map, HttpStatus.OK);
        return responseEntity;
    }
}
