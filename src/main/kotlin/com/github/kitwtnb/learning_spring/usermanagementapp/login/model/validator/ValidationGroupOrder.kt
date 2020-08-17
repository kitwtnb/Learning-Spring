package com.github.kitwtnb.learning_spring.usermanagementapp.login.model.validator

import javax.validation.GroupSequence

interface ValidationGroup1
interface ValidationGroup2
interface ValidationGroup3

@GroupSequence(
    ValidationGroup1::class,
    ValidationGroup2::class,
    ValidationGroup3::class
)
interface ValidationGroupOrder
