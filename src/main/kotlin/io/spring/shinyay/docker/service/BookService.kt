package io.spring.shinyay.docker.service

import io.spring.shinyay.docker.entity.Book
import io.spring.shinyay.docker.repository.BookRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service

@Service
class BookService(val repository: BookRepository) {

    @Bean
    fun initialSetUp(repository: BookRepository) = CommandLineRunner {
        repository.save(Book("Spring Boot 3.1 RC1", "shinyay"))
    }

    fun findAllBooks(): MutableList<Book> = repository.findAll()
}
