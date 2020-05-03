package ru.hadgehok.seriousill.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SeriousIll {

    @GetMapping("/test")
    fun test(@RequestParam(value = "name", defaultValue = "World") name: String) =
        "Hello, World"

}