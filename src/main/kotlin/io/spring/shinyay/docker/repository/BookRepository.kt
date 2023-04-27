package io.spring.shinyay.docker.repository

import io.spring.shinyay.docker.entity.Book
import org.springframework.data.repository.ListCrudRepository

interface BookRepository: ListCrudRepository<Book, Long> {
}
