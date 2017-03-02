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
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
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

    /**
     * url 格式 "air/point/{air_point}" 方法: GET
     * 根据检测地点查询数据
     * @param page 页数
     * @param size 页面大小
     *
     * */
    @RequestMapping(value = "/point/{air_point}",method = RequestMethod.GET)
    public ResponseEntity<?> getByLocation(@PathVariable("air_point") String airPoint, @RequestParam(value = "page",defaultValue = "0") Integer page, @RequestParam(value = "size",defaultValue = "20") Integer size){
//        System.out.println("AIR_POINT:"+airPoint);
        Sort sort = new Sort(Sort.Direction.DESC,"time");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<AirEntity> airEntityList;
        airEntityList =  airRepository.findByAirPoint(airPoint,pageable);
        Map map = new HashMap();
        map.put("result",airEntityList);
        map.put("status","success");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    /**
     *
     *  url 格式 "air/time"  方法：GET
     * 根据时间查询，unix时间戳，long 类型
     * @param from_timestamp 起始日期
     * @param to_timestamp 终点日期
     *
     * */
    @RequestMapping("/time")
    public ResponseEntity<?> getByTime(@RequestParam(value = "from",defaultValue = "0")long from_timestamp,@RequestParam(value = "to",defaultValue = "0")long to_timestamp){
//        System.out.println("data get :"+from_timestamp+to_timestamp);
        Timestamp fromTime = new Timestamp(from_timestamp);
        Timestamp toTime = new Timestamp(to_timestamp);
        List<AirEntity> airEntityList;
        airEntityList = airRepository.findByTime(fromTime,toTime);
        Map map = new HashMap();
        map.put("result",airEntityList);
        map.put("status","success");
        return new ResponseEntity<>(map,HttpStatus.OK);
    }
}
