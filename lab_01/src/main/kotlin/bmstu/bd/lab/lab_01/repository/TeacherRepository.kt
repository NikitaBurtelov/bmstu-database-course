package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Teacher
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherRepository: JpaRepository<String, Teacher> {
}