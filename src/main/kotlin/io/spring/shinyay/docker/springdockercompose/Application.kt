package io.spring.shinyay.docker.springdockercompose

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDockerComposeApplication

fun main(args: Array<String>) {
	runApplication<SpringDockerComposeApplication>(*args)
}
