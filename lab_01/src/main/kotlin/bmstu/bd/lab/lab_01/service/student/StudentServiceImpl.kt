package bmstu.bd.lab.lab_01.service.student

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Student
import bmstu.bd.lab.lab_01.repository.StudentRepository
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.sql.Date
import java.util.*

@Service
class StudentServiceImpl @Autowired constructor(
    val studentRepository: StudentRepository
): StudentService {
    private val faker = Faker.instance()

    override fun createEntityStudent(group: Group): Student {
        return Student(
            idStudyGroup = group,
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            dob = faker.date().birthday(15, 100) as Date,
            sex = faker.demographic().sex(),
            email = faker.internet().emailAddress(),
        )
    }

    override fun createEntityStudent(count: Int): LinkedList<Student> {
        TODO()
    }

    override fun saveDataBase(student: Student) {
        studentRepository.save(student)
    }

    override fun saveDataBase(students: LinkedList<Student>) {
        TODO("Not yet implemented")
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}