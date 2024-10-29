package org.example.wsdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WsDemoApplication

fun main(args: Array<String>) {
    runApplication<WsDemoApplication>(*args)
}
