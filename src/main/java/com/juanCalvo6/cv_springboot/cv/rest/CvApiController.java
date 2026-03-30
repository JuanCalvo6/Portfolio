package com.juanCalvo6.cv_springboot.cv.rest;

import com.juanCalvo6.cv_springboot.cv.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CvApiController {

    @GetMapping("/cv")
    public Person getPerson(){
        return new Person("Juan","Calvo", "Engeenier");
    }
}
