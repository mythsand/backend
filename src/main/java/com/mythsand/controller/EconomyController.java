package com.mythsand.controller;

import com.mythsand.model.EconomyEntity;
import com.mythsand.repository.EconomyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mythsand on 27/02/2017.
 */
@RestController
@RequestMapping("/economy")
public class EconomyController {

    @Autowired
    EconomyRepository economyRepository;

    @RequestMapping(value = "/city/{city}", method = RequestMethod.GET)
    public Page<?> getByCity(@PathVariable(value = "city") String city,@RequestParam(value = "page",defaultValue = "0") Integer page,@RequestParam(value = "size",defaultValue = "20") Integer size){
        Sort sort = new Sort(Sort.Direction.DESC,"time");
        Pageable pageable = new PageRequest(page,size,sort);

//        Page<EconomyEntity> economyEntities = economyRepository.findByCity(city,pageable);
//        Map map = new HashMap();
//        map.put("result",economyEntities);
//        map.put("status","success");
//        return new ResponseEntity<Object>(map, HttpStatus.OK);
        return economyRepository.findByCity(city,pageable);
    }

}
