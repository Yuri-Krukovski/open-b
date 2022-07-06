package com.example.starter.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello";
    }
}
