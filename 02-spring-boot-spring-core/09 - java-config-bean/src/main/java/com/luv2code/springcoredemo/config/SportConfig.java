package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    // manually handling the construction of swim coach
    // bean id defaults to the method name, we add a custom name here
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
