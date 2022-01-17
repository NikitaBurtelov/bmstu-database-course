package bmstu.bd.lab.lab_01.service.teacherStudyGroupKey

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Teacher
import bmstu.bd.lab.lab_01.model.TeacherStudyGroupKey
import bmstu.bd.lab.lab_01.repository.TeacherStudyGroupKeyRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class TeacherStudyGroupKeyServiceImpl @Autowired constructor(
    private val teacherStudyGroupKey: TeacherStudyGroupKeyRepository
): TeacherStudyGroupKeyService {
    override fun createEntityTeacherStudyGroupKey(institution: Institution, group: Group): Teacher {
        TODO("Not yet implemented")
    }

    override fun createEntityTeacherStudyGroupKey(
        institutions: LinkedList<Institution>,
        groups: LinkedList<Group>
    ): Teacher {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(teacherStudyGroupKey: TeacherStudyGroupKey) {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(teacherStudyGroupKeys: LinkedList<TeacherStudyGroupKey>) {
        TODO("Not yet implemented")
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }

}