package bmstu.bd.lab.lab_01.service.teacher

import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Teacher
import bmstu.bd.lab.lab_01.repository.TeacherRepository
import bmstu.bd.lab.lab_01.utils.fileWriter.CsvFileWriter
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.sql.Date
import java.util.*
import kotlin.random.Random

@Service
class TeacherServiceImpl @Autowired constructor(
    private val teacherRepository: TeacherRepository
) : TeacherService {
    val faker = Faker.instance()

    override fun createEntityTeacher(institution: Institution): Teacher {
        return Teacher(
            idInstitution = institution,
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            dob = Date(faker.date().birthday(18, 100).time),
            sex = faker.demographic().sex(),
            phone = faker.phoneNumber().phoneNumber(),
            education = faker.educator().university()
        )
    }

    override fun createEntityTeacher(institutions: LinkedList<Institution>): LinkedList<Teacher> {
        val teachers = LinkedList<Teacher>()

        for (institution in institutions) {
            val count = Random.nextInt(5, 15)

            for (i in 0..count)
                teachers.add(createEntityTeacher(institution))
        }
        return teachers
    }

    override fun saveDataBase(teacher: Teacher) {
        teacherRepository.save(teacher)
    }

    override fun saveDataBase(teacher: LinkedList<Teacher>) {
        teacherRepository.saveAll(teacher)
    }

    override fun saveCSV(teachers: LinkedList<Teacher>, cleanDir: Boolean) {
        CsvFileWriter<Teacher>()
            .write(
                teachers,
                Teacher::class,
                arrayOf("id", "title", "phone", "address", "rating"),
                cleanDir
            )
    }
}