package com.example.sec8webscopes.controllers;

import com.example.sec8webscopes.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private LoginProcessor loginProcessor;

    public LoginController() {
        this.loginProcessor = new LoginProcessor();
    }

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        loginProcessor.setPassword(password);
        loginProcessor.setUsername(username);
        boolean loggedIn = loginProcessor.login();

        if (loggedIn) {
            model.addAttribute("message", "Welcome "+ username);
            return "welcome.html";
        } else {
            model.addAttribute("message", "Log in failed!");
            return "login.html";
        }

    }
}
