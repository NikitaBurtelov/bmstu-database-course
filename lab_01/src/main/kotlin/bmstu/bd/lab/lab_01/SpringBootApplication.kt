package bmstu.bd.lab.lab_01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = ["bmstu.bd.lab.lab_01"])
@EntityScan("bmstu.bd.lab.lab_01.model")
@EnableJpaRepositories(
	basePackages = ["bmstu.bd.lab.lab_01.repository"]
)
class Lab01Application

fun main(args: Array<String>) {
	runApplication<Lab01Application>(*args)
}
