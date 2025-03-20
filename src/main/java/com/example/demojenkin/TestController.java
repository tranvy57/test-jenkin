package com.example.demojenkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String test() {
        return "Em Zy cute vai lon";
    }

    @GetMapping ("/tesst")
    public String add() {
        return "add gi do";
    }

    @GetMapping ("/tesst2")
    public String add2() {
        return "add gi do 2";
    }


    @GetMapping ("/tesst3")
    public String add3() {
        return "add gi do 3";
    }
}
