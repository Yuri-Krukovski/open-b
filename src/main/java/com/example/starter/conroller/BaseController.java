package com.example.starter.conroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(path = "/hello")
    public ApiResponse<String> sayHello() {
        return ApiResponse.createApiResponse(HttpStatus.OK.value(), "HELLO");
    }
}
