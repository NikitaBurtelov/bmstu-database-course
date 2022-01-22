package bmstu.bd.lab.lab_01.service.teacherStudyGroupKey

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Teacher
import bmstu.bd.lab.lab_01.model.TeacherStudyGroupKey
import java.util.*

interface TeacherStudyGroupKeyService {
    fun createEntityTeacherStudyGroupKey(teacher: Teacher, group: Group): TeacherStudyGroupKey
    fun createEntityTeacherStudyGroupKey(teachers: LinkedList<Teacher>, groups: LinkedList<Group>): LinkedList<TeacherStudyGroupKey>
    fun saveDataBase(teacherStudyGroupKey: TeacherStudyGroupKey)
    fun saveDataBase(teacherStudyGroupKeys: LinkedList<TeacherStudyGroupKey>)
    fun saveCSV(teacherStudyGroupKeys: LinkedList<TeacherStudyGroupKey>, cleanDir: Boolean = false)
    fun saveCSV()
}