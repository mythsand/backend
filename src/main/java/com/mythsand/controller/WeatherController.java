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

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mythsand on 27/02/2017.
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherRepository weatherRepository;
    /**
     *   url  匹配 "/weather/city/{city}"  方法：GET
     *   @param page
     *   @param size
     *
     *  @return
     * */
    @RequestMapping(value = "/city/{city}",method = RequestMethod.GET)
    public Page<?> getByCity(@PathVariable(value = "city") String city, @RequestParam(value = "page",defaultValue = "0") Integer page,@RequestParam(value = "size",defaultValue = "20") Integer size){
        Sort sort = new Sort(Sort.Direction.DESC,"time");
        Pageable pageable = new PageRequest(page,size,sort);
//        Page<WeatherEntity> weatherEntityPage = weatherRepository.findByCity(city,pageable);
//        Map map = new HashMap();
//        map.put("result",weatherEntityPage);
//        map.put("status","success");
//        return new ResponseEntity<>(map, HttpStatus.OK);
        return weatherRepository.findByCity(city, pageable);
    }

    /**
     *
     *  url   "/weather/time"  方法： GET
     *  @param from_timestamp
     *  @param to_timestamp
     *
     *  @return
     * */

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public List<?> getByTime(@RequestParam(value = "from",defaultValue = "0") long from_timestamp, @RequestParam(value = "to", defaultValue = "0") long to_timestamp){
        Timestamp fromTime = new Timestamp(from_timestamp);
        Timestamp toTime = new Timestamp(to_timestamp);
//        List<WeatherEntity> weatherEntityList;
//        weatherEntityList = weatherRepository.findByTime(fromTime,toTime);
//        Map map = new HashMap();
//        map.put("result",weatherEntityList);
//        map.put("status","success");
//        return new ResponseEntity<>(map,HttpStatus.OK);
        return weatherRepository.findByTime(fromTime, toTime);
    }

}
