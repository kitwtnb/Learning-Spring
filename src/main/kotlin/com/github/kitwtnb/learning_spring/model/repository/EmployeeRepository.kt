package com.github.kitwtnb.learning_spring.model.repository

import com.github.kitwtnb.learning_spring.model.data.Employee
import org.springframework.jdbc.core.JdbcTemplate

interface EmployeeRepository {
    fun findOne(id: Int): Employee
}

class EmployeeRepositoryImpl(
    private val jdbcTemplate: JdbcTemplate
): EmployeeRepository {
    override fun findOne(id: Int): Employee {
        val query = """
            SELECT
              employee_id,
              employee_name,
              age
            FROM employee
            WHERE employee_id=?
        """.trimIndent()
        val map = jdbcTemplate.queryForMap(query, id)

        return Employee(
            id = map["employee_id"] as Int,
            name = map["employee_name"] as String,
            age = map["age"] as Int
        )
    }
}
