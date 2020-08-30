package com.github.kitwtnb.learning_spring.usermanagementapp.login.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LogAspect {
    @Before("execution(* *..*.*Controller.*(..))")
    fun beginLog(joinPoint: JoinPoint) {
        println("begin method: ${joinPoint.signature}")
    }

    @After("execution(* *..*.*Controller.*(..))")
    fun endLog(joinPoint: JoinPoint) {
        println("end method: ${joinPoint.signature}")
    }
}
