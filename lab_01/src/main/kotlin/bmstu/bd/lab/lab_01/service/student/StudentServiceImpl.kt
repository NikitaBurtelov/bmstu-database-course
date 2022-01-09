package bmstu.bd.lab.lab_01.service.student

import bmstu.bd.lab.lab_01.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl @Autowired constructor(
    val studentRepository: StudentRepository
) {
}