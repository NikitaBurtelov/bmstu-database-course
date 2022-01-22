package bmstu.bd.lab.lab_01

import bmstu.bd.lab.lab_01.service.contract.ContractService
import bmstu.bd.lab.lab_01.service.group.GroupService
import bmstu.bd.lab.lab_01.service.institution.InstitutionService
import bmstu.bd.lab.lab_01.service.student.StudentService
import bmstu.bd.lab.lab_01.service.teacher.TeacherService
import bmstu.bd.lab.lab_01.service.teacherStudyGroupKey.TeacherStudyGroupKeyService
import bmstu.bd.lab.lab_01.utils.ui.Ui
import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.scheduling.annotation.Async
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableTransactionManagement
@SpringBootApplication
@EntityScan("bmstu.bd.lab.lab_01.model")
@EnableJpaRepositories(
	basePackages = ["bmstu.bd.lab.lab_01.repository"]
)
@Async
class Lab01Application

fun main(args: Array<String>) {
	val context = runApplication<Lab01Application>(*args)

	val log = KotlinLogging.logger {}

	val ui = context.getBean(Ui::class.java)

	val institutionService = context.getBean(InstitutionService::class.java)
	val groupService = context.getBean(GroupService::class.java)
	val studentService = context.getBean(StudentService::class.java)
	val teacherService = context.getBean(TeacherService::class.java)
	val contractService = context.getBean(ContractService::class.java)
	val teacherStudyGroupKeyService = context.getBean(TeacherStudyGroupKeyService::class.java)


	ui.bmstuLogo()
	ui.appLogo()
	log.info("Creating entity Institution")
	val institutions = institutionService.createEntityInstitution(10)
	log.info("Entity created")

	log.info("Creating entity Teacher")
	val teachers = teacherService.createEntityTeacher(institutions)
	log.info("Entity created")

	log.info("Creating entity Group")
	val groups = groupService.createEntityGroup(20)
	log.info("Entity created")

	log.info("Creating entity Student")
	val students = studentService.createEntityStudent(groups)
	log.info("Entity created")

	log.info("Creating entity Contract")
	val contracts = contractService.createEntityContract(students)
	log.info("Entity created")

	log.info("Creating entity TeacherStudyGroupKey")
	val teacherStudyGroupKeys = teacherStudyGroupKeyService.createEntityTeacherStudyGroupKey(teachers, groups)
	log.info("Entity created")

	institutionService.saveDataBase(institutions)
	teacherService.saveDataBase(teachers)
	groupService.saveDataBase(groups)
	studentService.saveDataBase(students)
	contractService.saveDataBase(contracts)
	teacherStudyGroupKeyService.saveDataBase(teacherStudyGroupKeys)

	institutionService.saveCSV(institutions, true)
	teacherService.saveCSV(teachers)
	groupService.saveCSV(groups)
	studentService.saveCSV(students)
	contractService.saveCSV(contracts)
	teacherStudyGroupKeyService.saveCSV(teacherStudyGroupKeys)

	//TODO отрефакторить код + нейминг
}