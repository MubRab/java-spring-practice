package com.example.sec8webscopes.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * The LoginProcessor class uses the Request Scope, which means that a new instance is created everytime a there is
 * a new request.
 */
@Component
@RequestScope
public class LoginProcessor {
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

    public boolean login() {
        return ("user1".equals(this.username) && "pwd".equals(this.password));
    }
}
