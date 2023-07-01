package com.berdanakbulut.kotlinecommercedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class]) // Disabling spring security for now.
class KotlinEcommerceDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlinEcommerceDemoApplication>(*args)
}
