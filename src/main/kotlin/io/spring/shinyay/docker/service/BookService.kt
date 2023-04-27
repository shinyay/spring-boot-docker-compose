package io.spring.shinyay.docker.service

import io.spring.shinyay.docker.entity.Book
import io.spring.shinyay.docker.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(val repository: BookRepository) {

    fun findAllBooks(): MutableList<Book> = repository.findAll()
}
