package com.example.sec71dynamicwebpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(Model page) {
        page.addAttribute("user", "John");
        page.addAttribute("colour","red");
        return "home.html";
    }
}
