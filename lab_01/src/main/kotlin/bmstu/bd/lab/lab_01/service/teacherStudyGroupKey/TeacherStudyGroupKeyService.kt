package bmstu.bd.lab.lab_01.service.teacherStudyGroupKey

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Teacher
import bmstu.bd.lab.lab_01.model.TeacherStudyGroupKey
import java.util.*

interface TeacherStudyGroupKeyService {
    fun createEntityTeacherStudyGroupKey(institution: Institution, group: Group): Teacher
    fun createEntityTeacherStudyGroupKey(institutions: LinkedList<Institution>, groups: LinkedList<Group>): Teacher
    fun saveDataBase(teacherStudyGroupKey: TeacherStudyGroupKey)
    fun saveDataBase(teacherStudyGroupKeys: LinkedList<TeacherStudyGroupKey>)
    fun saveCSV(path: String)
    fun saveCSV()
}