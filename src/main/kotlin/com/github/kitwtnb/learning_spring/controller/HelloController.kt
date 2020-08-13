package com.github.kitwtnb.learning_spring.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    @GetMapping("/hello")
    fun hello(): String {
        // html file path from "resources/templates"html file path from "resources/templates"
        // this is "resources/templates/hello.html"
        return "hello"
    }
}
