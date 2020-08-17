package com.github.kitwtnb.learning_spring.usermanagementapp.login.controller

import com.github.kitwtnb.learning_spring.usermanagementapp.login.model.SignupForm
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class SignupController {
    @GetMapping("/user_management_app/signup")
    fun signup(@ModelAttribute form: SignupForm?, model: Model): String {
        model.addAttribute("marriage", mapOf(
            "Unmarried" to false,
            "Married" to true
        ))
        return "usermanagementapp/login/signup"
    }

    @PostMapping("/user_management_app/signup")
    fun postSignup(
        @ModelAttribute form: SignupForm?,
        bindingResult: BindingResult,
        model: Model
    ): String {
        if (bindingResult.hasErrors()) {
            return signup(form, model)
        }

        println(form)

        return "redirect:/user_management_app/login"
    }
}
