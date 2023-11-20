package com.katfun.jpa.kotlin.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaKotlinPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<JpaKotlinPlaygroundApplication>(*args)
}
