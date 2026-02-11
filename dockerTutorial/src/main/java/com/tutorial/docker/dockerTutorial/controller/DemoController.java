package com.tutorial.docker.dockerTutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String getMessage() {
        return "Hello, Docker!!";
    }
}
