package com.github.kitwtnb.learning_spring.di

import com.github.kitwtnb.learning_spring.model.repository.EmployeeRepository
import com.github.kitwtnb.learning_spring.model.repository.EmployeeRepositoryImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate

@Configuration
class RepositoryConfig {
    @Bean
    fun employeeRepository(jdbcTemplate: JdbcTemplate): EmployeeRepository = EmployeeRepositoryImpl(jdbcTemplate)
}
