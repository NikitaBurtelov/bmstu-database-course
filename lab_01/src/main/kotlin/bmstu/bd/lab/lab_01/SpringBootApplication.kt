package bmstu.bd.lab.lab_01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class Lab01Application

fun main(args: Array<String>) {
	runApplication<Lab01Application>(*args)
}
