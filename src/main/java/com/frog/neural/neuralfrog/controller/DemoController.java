package com.frog.neural.neuralfrog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/greet")
public class DemoController {
    @GetMapping("/hello")
    public String name() {
        return "hello frog";
    }
    
}
