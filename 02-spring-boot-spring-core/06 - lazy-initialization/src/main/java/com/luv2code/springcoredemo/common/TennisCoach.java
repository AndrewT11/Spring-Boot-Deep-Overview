package com.luv2code.springcoredemo.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "30 mins volley practice";
    }
}
