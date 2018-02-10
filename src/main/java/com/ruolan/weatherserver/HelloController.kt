package com.ruolan.weatherserver

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
class HelloController {

    @RequestMapping("/hello")
    private fun index(): String {
        return "Hello World !!!"
    }


}