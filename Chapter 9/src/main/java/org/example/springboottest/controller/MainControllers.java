package org.example.springboottest.controller;

import org.example.springboottest.LoggedUserManagementService;
import org.example.springboottest.LoginCountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {
    private LoggedUserManagementService loggedUserManagementService;
    private LoginCountService loginCountService;

    public MainControllers(LoggedUserManagementService loggedUserManagementService,
                           LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String homePage(@RequestParam(required = false)
                               String logout, Model model) {
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();

        if (username == null) {
            return "redirect:/";
        }

        int count = loginCountService.getCount();

        model.addAttribute("username", username);
        model.addAttribute("count", count);
        return "main.html";
    }
}
