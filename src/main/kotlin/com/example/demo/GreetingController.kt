package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
data class Message(
    val message: String
)
@RestController
class GreetingController {
    @GetMapping("/hello")
    fun hello():Message=Message("Hello World")
}