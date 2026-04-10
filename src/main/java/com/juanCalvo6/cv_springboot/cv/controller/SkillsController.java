package com.juanCalvo6.cv_springboot.cv.controller;

import com.juanCalvo6.cv_springboot.cv.model.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/skills")
public class SkillsController {

    private final List<Skill> skills = new ArrayList<>();

//    @GetMapping
//    public String showSkills(Model model){
//        model.addAttribute("skills", skills);
//        return "skills";
//    }

    @GetMapping
    public String showSkills(@RequestParam(defaultValue = "", required = false) String filter, Model model){
        List<Skill> skillsFilter = skills.stream()
                        .filter(skill -> skill.getName().toLowerCase().contains(filter.toLowerCase()))
                        .toList();
        model.addAttribute("skills", skillsFilter);
        model.addAttribute("filter", filter);
        return "skills";
    }

    @GetMapping("/new")
    public String showForm(Model model){
        model.addAttribute("skill", new Skill());
        return "add-skill";
    }

    @PostMapping("/add")
    public String addSkill(@ModelAttribute Skill skill){
        skills.add(skill);
        return "redirect:/skills";
    }
}
