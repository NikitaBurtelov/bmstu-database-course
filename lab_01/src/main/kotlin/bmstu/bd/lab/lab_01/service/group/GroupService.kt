package bmstu.bd.lab.lab_01.service.group

import bmstu.bd.lab.lab_01.model.Group
import java.util.*

interface GroupService {
    fun createEntityGroup(): Group
    fun createEntityGroup(count: Int): LinkedList<Group>
    fun saveDataBase(group: Group)
    fun saveDataBase(groups: LinkedList<Group>)
    fun saveCSV(groups: LinkedList<Group>, cleanDir: Boolean = false)
}