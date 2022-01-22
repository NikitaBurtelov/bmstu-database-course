package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Teacher
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeacherRepository: JpaRepository<Teacher, Int>