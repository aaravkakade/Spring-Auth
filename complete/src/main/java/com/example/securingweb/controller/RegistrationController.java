package com.example.securingweb.controller;

import com.example.securingweb.model.User;
import com.example.securingweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") User user) {
        try {
            userService.registerNewUser(user);
            return "redirect:/login?registered";
        } catch (RuntimeException e) {
            return "redirect:/register?error=" + e.getMessage();
        }
    }
} 