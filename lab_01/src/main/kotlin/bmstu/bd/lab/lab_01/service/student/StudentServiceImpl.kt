package bmstu.bd.lab.lab_01.service.student

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Student
import bmstu.bd.lab.lab_01.repository.StudentRepository
import bmstu.bd.lab.lab_01.utils.fileWriter.CsvFileWriter
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.sql.Date
import java.util.*
import kotlin.random.Random

@Service
class StudentServiceImpl @Autowired constructor(
    private val studentRepository: StudentRepository
): StudentService {
    private val faker = Faker.instance()

    override fun createEntityStudent(group: Group): Student {
        return Student(
            idStudyGroup = group,
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            dob = Date(faker.date().birthday(16, 25).time),
            sex = faker.demographic().sex(),
            email = faker.internet().emailAddress(),
        )
    }

    override fun createEntityStudent(groups: LinkedList<Group>): LinkedList<Student> {
        val students = LinkedList<Student>()
        val count = Random.nextInt(20, 30)

        for (group in groups) {
            for (i in 0..count) {
                students.add(createEntityStudent(group))
            }
        }

        return students
    }

    override fun saveDataBase(student: Student) {
        studentRepository.save(student)
    }

    override fun saveDataBase(students: LinkedList<Student>) {
        studentRepository.saveAll(students)
    }

    override fun saveCSV(students: LinkedList<Student>, cleanDir: Boolean) {
        CsvFileWriter<Student>()
            .write(
                students,
                Student::class,
                arrayOf("id", "title", "phone", "address", "rating"),
                cleanDir
            )
    }
}