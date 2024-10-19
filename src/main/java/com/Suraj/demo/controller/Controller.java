package com.Suraj.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class Controller {

    @Value("${app.myname}")
    private String appName;
    @GetMapping
    public String hello(){

        return appName;
    }
}
