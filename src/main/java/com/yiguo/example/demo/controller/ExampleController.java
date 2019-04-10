package com.yiguo.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleController {
    @GetMapping("/docker")
    public String docker() {
        return "hello docker";
    }


    @GetMapping("/docker1")
    public String docker1() {
        return "hello docker1";
    }
}
