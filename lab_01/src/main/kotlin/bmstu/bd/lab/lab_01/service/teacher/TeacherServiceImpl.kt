package bmstu.bd.lab.lab_01.service.teacher

import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Teacher
import bmstu.bd.lab.lab_01.repository.TeacherRepository
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.sql.Date
import java.util.LinkedList

@Service
class TeacherServiceImpl @Autowired constructor(
    val teacherRepository: TeacherRepository
) : TeacherService{
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

    override fun createEntityTeacher(count: Int): LinkedList<Teacher> {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(teacher: Teacher) {
        teacherRepository.save(teacher)
    }

    override fun saveDataBase(teacher: LinkedList<Teacher>) {
        TODO("Not yet implemented")
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}