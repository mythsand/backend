package com.mythsand.controller;

import com.mythsand.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by mythsand on 27/02/2017.
 */
@Controller
@ResponseBody
@RequestMapping("/")
public class MainController {

    @Autowired
    CityRepository cityRepository;


    @RequestMapping("/index")
    public String root(){
        return "/index";
    }

    @RequestMapping("city")
    public List getCity(){
        return cityRepository.findAll();
    }
    @RequestMapping("province/{province}")
    public List<?> getByProvince(@PathVariable("province")String province){
        return cityRepository.findByProvince(province);
    }

    @RequestMapping("province")
    public List<?> getProvince(){
        return cityRepository.findProvince();
    }
}
