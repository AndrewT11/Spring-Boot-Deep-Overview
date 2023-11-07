package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // need controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        // src/main/resources/templates/helloworld-form.html
        return "helloworld-form";
    }


    // need a controller method to process the HTML form
}
