package io.spring.shinyay.docker.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Book(
    @Id
    @GeneratedValue
    val id: Long,
    val name: String,
    val author: String
)
