package br.com.zenha.kukumber

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KukumberApplication

fun main(args: Array<String>) {
    runApplication<KukumberApplication>(*args)
}
