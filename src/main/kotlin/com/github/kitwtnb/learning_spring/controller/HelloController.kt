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

    @GetMapping("/nested_hello")
    fun nestedHello1(): String {
        // this is "resources/templates/nested/hello.html"
        return "nested/nested_hello"
    }

    @GetMapping("/nested/hello")
    fun nestedHello2(): String {
        // this is "resources/templates/nested/hello.html"
        return "nested/nested_hello"
    }
}
