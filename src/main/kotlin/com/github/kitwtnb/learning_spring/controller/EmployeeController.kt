package com.github.kitwtnb.learning_spring.controller

import com.github.kitwtnb.learning_spring.model.service.EmployeeService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class EmployeeController(
    private val employeeService: EmployeeService
) {
    @GetMapping("/employee")
    fun employee(model: Model): String {
        val employee = employeeService.findOne(1)
        model.addAllAttributes(mapOf(
            "id" to employee.id,
            "name" to employee.name,
            "age" to employee.age
        ))

        return "employee/employee"
    }
}
