package com.juanCalvo6.cv_springboot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SkillsController {

    @GetMapping("/skills")
    public String skills(Model model){
        List<String> skills = List.of("java", "Springboot", "HTML", "CSS");
        model.addAttribute("skills", skills);
        return "skills";
    }
}
