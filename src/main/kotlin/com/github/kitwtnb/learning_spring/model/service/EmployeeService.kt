package com.github.kitwtnb.learning_spring.model.service

import com.github.kitwtnb.learning_spring.model.data.Employee
import com.github.kitwtnb.learning_spring.model.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(
    private val employeeRepository: EmployeeRepository
) {
    fun findOne(id: Int): Employee = employeeRepository.findOne(id)
}
