package com.gini;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.value}")
    private String testValue;

    @GetMapping("/test")
    public String getTestValue(){
        return testValue;
    }

}
