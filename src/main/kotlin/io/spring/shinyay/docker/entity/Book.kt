package io.spring.shinyay.docker.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Book(
    val name: String,
    val author: String
) {
    @Id
    @GeneratedValue
    val id: Long? = null

    constructor() : this("", "")
}
