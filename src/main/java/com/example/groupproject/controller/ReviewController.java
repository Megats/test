package com.example.groupproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewController{
    @GetMapping("/review")
    public String menu(Model model) {
        // Add data to the model
        return "review"; // This will return the name of your HTML template (e.g., example.html)
    }

}
