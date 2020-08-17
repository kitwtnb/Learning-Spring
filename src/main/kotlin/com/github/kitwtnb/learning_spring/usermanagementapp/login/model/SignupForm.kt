package com.github.kitwtnb.learning_spring.usermanagementapp.login.model

import com.github.kitwtnb.learning_spring.usermanagementapp.login.model.validator.ValidationGroup1
import com.github.kitwtnb.learning_spring.usermanagementapp.login.model.validator.ValidationGroup2
import com.github.kitwtnb.learning_spring.usermanagementapp.login.model.validator.ValidationGroup3
import org.hibernate.validator.constraints.Length
import org.springframework.format.annotation.DateTimeFormat
import java.util.Date
import javax.validation.constraints.AssertFalse
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern

data class SignupForm(
    @field:NotBlank(groups = [ValidationGroup1::class])
    @field:Email(groups = [ValidationGroup2::class])
    var userId: String = "",

    @field:NotBlank(groups = [ValidationGroup1::class])
    @field:Length(min = 8, max = 100, groups = [ValidationGroup2::class])
    @field:Pattern(regexp = "^[a-zA-Z0-9]+$", groups = [ValidationGroup3::class])
    var password: String = "",

    @field:NotBlank(groups = [ValidationGroup1::class])
    var userName: String = "",

    @field:NotNull(groups = [ValidationGroup1::class])
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    var birthday: Date? = null,

    @field:Min(20, groups = [ValidationGroup2::class])
    @field:Max(100, groups = [ValidationGroup2::class])
    var age: Int = 0,

    @field:AssertFalse(groups = [ValidationGroup2::class])
    var marriage: Boolean = false
)
