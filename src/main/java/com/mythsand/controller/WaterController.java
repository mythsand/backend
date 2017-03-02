package com.mythsand.controller;

import com.mythsand.model.WaterEntity;
import com.mythsand.repository.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mythsand on 27/02/2017.
 */
@RestController
@RequestMapping("/water")
public class WaterController {

    @Autowired
    WaterRepository waterRepository;

    @RequestMapping(value = "/point/{point}", method = RequestMethod.GET)
    public ResponseEntity<?> getByPoint(@PathVariable(value = "point") String point, @RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "20") Integer size){
        Sort sort = new Sort(Sort.Direction.DESC,"time");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<WaterEntity> waterEntities = waterRepository.findByPoint(point,pageable);
        Map map = new HashMap();
        map.put("result",waterEntities);
        map.put("status","success");
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
}
