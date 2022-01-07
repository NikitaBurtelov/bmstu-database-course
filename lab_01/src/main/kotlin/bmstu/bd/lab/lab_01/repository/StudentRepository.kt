package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<String, Student> {
}