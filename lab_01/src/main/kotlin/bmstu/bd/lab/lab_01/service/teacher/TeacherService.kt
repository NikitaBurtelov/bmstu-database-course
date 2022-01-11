package bmstu.bd.lab.lab_01.service.teacher

import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Teacher
import java.util.*

interface TeacherService {
    fun createEntityTeacher(institution: Institution): Teacher
    fun createEntityTeacher(count: Int): LinkedList<Teacher>
    fun saveDataBase(teacher: Teacher)
    fun saveDataBase(teacher: LinkedList<Teacher>)
    fun saveCSV(path: String)
    fun saveCSV()
}