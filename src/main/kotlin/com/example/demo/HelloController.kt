package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
data class ViewAccount(
  val id: Int,
  val name: String
)
data class CreateAccount(
    val name: String
)
@RestController
@RequestMapping("/accounts")
class AccountController {
    @GetMapping("/")
    fun getAll(): Iterable<ViewAccount> =
        listOf(ViewAccount(id=1,name="first"))
    @PostMapping("/")
    fun create(@RequestBody request: CreateAccount): ViewAccount =
        ViewAccount(id=2, name=request.name)
}