package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController {
    // Inject properties for team name and coach name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // expose endpoints for teaminfo values
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach name: " + coachName + ", Team name: " + teamName;
    }

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
