package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("In doMyStartUpStuff(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("In doMyCleanUpStuff(): " + getClass().getSimpleName());
    }

    // define our destroy method

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }
}
