package io.spring.shinyay.docker.controller

import io.spring.shinyay.docker.entity.Book
import io.spring.shinyay.docker.service.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/books")
class BookController(val service: BookService) {

    @GetMapping
    fun findAllBooks() = service.findAllBooks()

    @PostMapping
    fun registerBook(@RequestBody book: Book) = service.registerBook(book)
}
