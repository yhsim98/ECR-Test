package com.example.ecr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/")
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("asdf", "zxcv");
        return map;
    }
}
