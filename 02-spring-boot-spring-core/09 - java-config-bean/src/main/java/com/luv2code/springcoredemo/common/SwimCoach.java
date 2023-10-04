package com.luv2code.springcoredemo.common;

public class SwimCoach implements Coach {

    // not using @Component hre on purpose
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warmup";
    }
}
