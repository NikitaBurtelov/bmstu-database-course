package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.TeacherStudyGroupKey
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherStudyGroupKeyRepository: JpaRepository<TeacherStudyGroupKey, Int> {
}