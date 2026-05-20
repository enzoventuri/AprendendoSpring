package org.example.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private LoggedUserManagementService loggedIn;

    @Autowired
    public LoginProcessor(LoggedUserManagementService loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn(String username, String password) {
        boolean loginResult = false;
        if (username.equals("Enzo") && password.equals("Senha123!")) {
            loginResult = true;
            loggedIn.setUsername(username);
        }

        return loginResult;
    }

}
