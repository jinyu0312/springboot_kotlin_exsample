package com.jinyu0321.demo

import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
@ComponentScan(basePackages = ["com.jinyu0321.demo", "com.jinyu0321.demo.presentation.gen", "com.jinyu0321.demo.application.model.gen"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
