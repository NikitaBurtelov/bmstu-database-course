package bmstu.bd.lab.lab_01.service.group

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.model.Group
import java.util.*

interface GroupService {
    fun generate()
    fun generate(count: Int)
    fun saveDataBase(contract: Group)
    fun saveDataBase(contracts: LinkedList<Group>)
    fun saveCSV(path: String)
    fun saveCSV()
}