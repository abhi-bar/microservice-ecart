package com.embarkx.ecommerce.controller;

import com.embarkx.ecommerce.model.User;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthUtil {

    public User loggesInUser() {
        return new User();
    }

    public String loggedInEmail() {
        return "userEmail";
    }
}
