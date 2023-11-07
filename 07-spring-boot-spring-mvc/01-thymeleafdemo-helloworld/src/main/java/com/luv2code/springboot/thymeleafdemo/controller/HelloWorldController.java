package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    // endpoint included in helloworld-form.html form annotation in th:action
    @RequestMapping("/processForm")
    public String processForm() {

        return "helloworld";

    }

    // need a controller method to read form data
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert data to all Uppercase
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
