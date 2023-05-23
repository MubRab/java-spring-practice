package com.example.sec8webscopes.model;

import com.example.sec8webscopes.services.LoggedUserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * The LoginProcessor class uses the Request Scope, which means that a new instance is created everytime a there is
 * a new request.
 */
@Component
@RequestScope
public class LoginProcessor {
    private final LoggedUserManagementService loggedUserManagementService;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Autowired
    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login() {
        if ("user1".equals(this.username) && "pwd".equals(this.password)) {
            loggedUserManagementService.setUsername(this.username);
            return true;
        } else {
            return false;
        }
    }
}
