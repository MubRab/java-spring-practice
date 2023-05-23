package com.example.sec8webscopes.controllers;

import com.example.sec8webscopes.services.LoggedUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
    private final LoggedUserManagementService loggedUserManagementService;

    @Autowired
    public WelcomeController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(required = false) String logout,
                          Model model) {

        if (logout != null) {
            loggedUserManagementService.setUsername(null);
//            model.addAttribute("message", "Logged out!");
            return "redirect:/";
        }

        String username = loggedUserManagementService.getUsername();
        model.addAttribute("username", loggedUserManagementService.getUsername());
        return "welcome.html";

    }
}
