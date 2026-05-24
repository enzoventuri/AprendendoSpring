package org.example.springboottest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private LoggedUserManagementService loggedIn;
    private LoginCountService loginCountService;

    @Autowired
    public LoginProcessor(LoggedUserManagementService loggedIn,
                          LoginCountService loginCountService) {
        this.loggedIn = loggedIn;
        this.loginCountService = loginCountService;
    }

    public boolean isLoggedIn(String username, String password) {
        loginCountService.addCount();

        boolean loginResult = false;
        if (username.equals("Enzo") && password.equals("Senha123!")) {
            loginResult = true;
            loggedIn.setUsername(username);
        }

        return loginResult;
    }

}
