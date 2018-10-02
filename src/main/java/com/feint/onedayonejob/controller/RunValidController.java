package com.feint.onedayonejob.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunValidController {

    @RequestMapping("/valid")
    public String valid(){
        return "one-day-one-job";
    }
}
