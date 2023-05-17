package com.example.sec71dynamicwebpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(@RequestParam(defaultValue = "John") String user, @RequestParam(defaultValue = "red") String colour, Model page) {
        page.addAttribute("user", user);
        page.addAttribute("colour",colour);
        return "home.html";
    }
}
