package com.example.PipelineServer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping
    public void getHello(){
        System.out.println("Hello");
    }
}
