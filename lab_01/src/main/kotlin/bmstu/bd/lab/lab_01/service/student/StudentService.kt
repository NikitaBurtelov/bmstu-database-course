package bmstu.bd.lab.lab_01.service.student

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Student
import java.util.*

interface StudentService {
    fun createEntityStudent(group: Group): Student
    fun createEntityStudent(groups: LinkedList<Group>): LinkedList<Student>
    fun saveDataBase(student: Student)
    fun saveDataBase(students: LinkedList<Student>)
    fun saveCSV(students: LinkedList<Student>, cleanDir: Boolean = false)
}