package com.mythsand.controller;

import com.mythsand.repository.WaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mythsand on 27/02/2017.
 */
@RestController
@RequestMapping("/water")
public class WaterController {

    @Autowired
    WaterRepository waterRepository;

}
