package bmstu.bd.lab.lab_01

import bmstu.bd.lab.lab_01.service.group.GroupService
import bmstu.bd.lab.lab_01.service.institution.InstitutionService
import bmstu.bd.lab.lab_01.service.institution.InstitutionServiceImpl
import bmstu.bd.lab.lab_01.service.student.StudentService
import bmstu.bd.lab.lab_01.service.teacher.TeacherService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
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
	val institutionService = context.getBean(InstitutionService::class.java)
	val groupService = context.getBean(GroupService::class.java)
	val studentService = context.getBean(StudentService::class.java)
	val teacherService = context.getBean(TeacherService::class.java)

	val institution = institutionService.createEntityInstitution()
	val teacher = teacherService.createEntityTeacher(institution)



	institutionService.saveDataBase(institution)
	teacherService.saveDataBase(teacher)
}