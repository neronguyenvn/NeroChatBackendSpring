package io.github.neronguyenvn.nerochat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NeroChatApp

fun main(args: Array<String>) {
	runApplication<NeroChatApp>(*args)
}
