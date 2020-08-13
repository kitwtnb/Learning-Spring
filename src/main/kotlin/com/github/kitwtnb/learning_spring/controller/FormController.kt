package com.github.kitwtnb.learning_spring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class FormController {
    @GetMapping("/form")
    fun form() = "form/form"

    @PostMapping("/form_post")
    fun formPost(
        // @RequestParam value for name in form
        @RequestParam("input_text") inputText: String,
        model: Model
    ): String {
        // add key and value, use value by view
        model.addAttribute("output_text", inputText)

        return "form/form_response"
    }
}
