package com.github.kitwtnb.learning_spring.usermanagementapp.login.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class LoginController {
    @GetMapping("/user_management_app/login")
    fun login() = "usermanagementapp/login/login"

    @PostMapping("/user_management_app/login")
    fun postLogin() = "usermanagementapp/login/login"
}
