package com.mythsand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mythsand on 27/02/2017.
 */
@Controller
@RequestMapping("/")
public class MainController {


    @RequestMapping("/index")
    public String root(){
        return "/index.jsp";
    }
}
