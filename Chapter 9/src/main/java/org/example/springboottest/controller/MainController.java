package org.example.springboottest.controller;

import org.example.springboottest.LoggedUserManagementService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {
    private LoggedUserManagementService loggedUserManagementService;

    public MainController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String homePage(@RequestParam(required = false) String logout, Model model) {
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();

        if (username == null) {
            return "redirect:/";
        }

        model.addAttribute("username", username);
        return "main.html";
    }
}
