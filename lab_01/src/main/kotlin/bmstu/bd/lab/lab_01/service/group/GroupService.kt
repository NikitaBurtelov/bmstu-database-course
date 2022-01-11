package bmstu.bd.lab.lab_01.service.group

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Student
import java.util.*

interface GroupService {
    fun createEntityGroup(students: LinkedList<Student>): Group
    fun saveDataBase(group: Group)
    fun saveDataBase(groups: LinkedList<Group>)
    fun saveCSV(path: String)
    fun saveCSV()
}