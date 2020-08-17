package com.github.kitwtnb.learning_spring.usermanagementapp.login.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class SignupController {
    @GetMapping("/user_management_app/signup")
    fun signup(model: Model): String {
        model.addAttribute("marriage", mapOf(
            "Unmarried" to false,
            "Married" to true
        ))
        return "usermanagementapp/login/signup"
    }

    @PostMapping("/user_management_app/signup")
    fun postSignup() = "redirect:/user_management_app/login"
}
