package com.github.kitwtnb.learning_spring.usermanagementapp.login.model

import org.springframework.format.annotation.DateTimeFormat
import java.util.Date

data class SignupForm(
    var userId: String?,
    var password: String?,
    var userName: String?,
    @DateTimeFormat(pattern = "yyyy/MM/dd") var birthday: Date?,
    var age: Int?,
    var marriage: Boolean?
)
