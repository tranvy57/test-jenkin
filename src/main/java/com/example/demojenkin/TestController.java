package com.example.demojenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String test() {
        return "Test Jenkin";
    }

    @GetMapping ("/tesst")
    public String add() {
        return "add gi do";
    }


}
