package bmstu.bd.lab.lab_01

import bmstu.bd.lab.lab_01.service.institution.InstitutionServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableTransactionManagement
@SpringBootApplication
@EntityScan("bmstu.bd.lab.lab_01.model")
@EnableJpaRepositories(
	basePackages = ["bmstu.bd.lab.lab_01.repository"]
)
class Lab01Application

fun main(args: Array<String>) {
	val context = runApplication<Lab01Application>(*args)
	val institutionService = context.getBean(InstitutionServiceImpl::class.java)

	institutionService.saveDataBase(institutionService.generate())
}