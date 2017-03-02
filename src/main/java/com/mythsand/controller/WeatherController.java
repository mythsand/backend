package com.mythsand.controller;

import com.mythsand.model.WeatherEntity;
import com.mythsand.repository.WeatherRepository;
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
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherRepository weatherRepository;

    @RequestMapping(value = "/city/{city}",method = RequestMethod.GET)
    public ResponseEntity<?> getByCity(@PathVariable(value = "city") String city, @RequestParam(value = "page",defaultValue = "0") Integer page,@RequestParam(value = "size",defaultValue = "20") Integer size){
        Sort sort = new Sort(Sort.Direction.DESC,"time");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<WeatherEntity> weatherEntityPage = weatherRepository.findByCity(city,pageable);
        Map map = new HashMap();
        map.put("result",weatherEntityPage);
        map.put("status","success");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
