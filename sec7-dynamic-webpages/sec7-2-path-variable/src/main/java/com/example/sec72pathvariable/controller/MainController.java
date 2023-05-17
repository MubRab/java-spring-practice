package com.example.sec72pathvariable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/{user}/{colour}")
    public String home(@PathVariable String user, @PathVariable String colour, Model page) {
        page.addAttribute("user", user);
        page.addAttribute("colour", colour);
        return "home.html";
    }
}
