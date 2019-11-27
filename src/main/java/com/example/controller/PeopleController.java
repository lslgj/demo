package com.example.controller;

import com.example.dao.PeopleRepository;
import com.example.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;

    @RequestMapping("/q1")
    public People q1(String name){
        return peopleRepository.findByName(name);
    }

    @RequestMapping("/q2")
    public People q2(Integer age){
        return peopleRepository.withQueryFindByAge(age);
    }

}
