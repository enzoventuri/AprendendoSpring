package org.example.springboottest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(Model page) {
        page.addAttribute("user", "Enzo");
        page.addAttribute("userColor", "green");

        return "home.html";
    }

    @RequestMapping("/ex02")
    public String requestParams(@RequestParam(required = false) String color,
                                @RequestParam(required = false) String name,
                                Model page) {
        page.addAttribute("user", name);
        page.addAttribute("color", color);

        return "ex02.html";
    }

    @RequestMapping("/pathVariables/{color}")
    public String pathVariable(@PathVariable String color,
                               Model page) {
        page.addAttribute("user", "Enzo");
        page.addAttribute("color", color);

        return "pathVariables.html";
    }

}
