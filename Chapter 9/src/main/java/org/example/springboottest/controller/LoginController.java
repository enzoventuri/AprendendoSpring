package org.example.springboottest.controller;

import org.example.springboottest.LoginProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginProcessor;

    @Autowired
    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {
        boolean loggedIn = loginProcessor.isLoggedIn(username, password);

        if (loggedIn) {
            return "redirect:/main";
        } else {
            model.addAttribute("message", "Login failed");
        }

        return "login.html";
    }
}
