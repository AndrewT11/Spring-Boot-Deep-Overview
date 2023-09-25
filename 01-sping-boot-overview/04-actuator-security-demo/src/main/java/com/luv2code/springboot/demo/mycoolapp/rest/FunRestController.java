package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that will return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a 5k!";
    }

    // another endpoint test
    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day";
    }

    @GetMapping("/onemoretest")
    public String getLastTest() {
        return "This is the last test.";
    }
}
