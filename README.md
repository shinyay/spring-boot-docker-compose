# Spring Boot 3.1 (RC1) with Docker Compose Integration

Spring Boot 3.1 provides new function to integrate with Docker Compose.
Let's take a look at it.

- [Spring Boot 3.1.0-RC1 available now](https://spring.io/blog/2023/04/22/spring-boot-3-1-0-rc1-available-now)

## Description

![initilizr](https://user-images.githubusercontent.com/3072734/234735255-eb4e45af-d743-4727-aed4-ce13a079aca9.png)

- ✅ Project: Gradle - Kotlin
- ✅ Language: Kotlin
- ✅ Spring Boot: 3.1.0 (RC1)
- Dependencies:
  - ✅ Spring Web
  - ✅ Spring Data JPA
  - ✅ PostgreSQL Driver

## Demo

![docker-compose](https://user-images.githubusercontent.com/3072734/234753473-10920dd4-b7c5-4272-8d23-47acd4cc6ee2.gif)

- Find All books
```shell
$ curl -X GET localhost:8080/api/v1/books
```

- Add a book
```shell
$ curl -X POST -H "Content-Type: application/json" -d '{ "name" : "Learning Spring Boot 3.0", "author" : "Greg Turnquist" }' localhost:8080/api/v1/books
```

## Features

- Docker Compose Integration
  - [Spring Boot 3.1.0-RC1 Release Notes - Docker Compose](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.1.0-RC1-Release-Notes#docker-compose)
- ListCrudRepository Interface
  - [Announcing ListCrudRepository & Friends for Spring Data 3.0](https://spring.io/blog/2022/02/22/announcing-listcrudrepository-friends-for-spring-data-3-0)

## Requirement

## Usage

## Installation

## References

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
- twitter: https://twitter.com/yanashin18618
