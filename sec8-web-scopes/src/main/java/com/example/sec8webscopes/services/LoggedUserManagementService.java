package com.example.sec8webscopes.services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

/**
 * This class is a Session scoped bean
 * which means that the bean will be stored in memory for the duration of the session, and any requests will use
 * the created bean, instead of creating a new bean.
 */

@Component
@SessionScope
public class LoggedUserManagementService {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
