package com.juanCalvo6.cv_springboot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CvController {

    @GetMapping("")
    public String index(){
        return "index";
    }
}
