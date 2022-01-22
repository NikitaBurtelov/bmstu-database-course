package bmstu.bd.lab.lab_01.service.contract

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.model.Student
import java.util.*

interface ContractService {
    fun createEntityContract(student: Student) : Contract
    fun createEntityContract(students: LinkedList<Student>) : LinkedList<Contract>
    fun saveDataBase(contract: Contract)
    fun saveDataBase(contracts: LinkedList<Contract>)
    fun saveCSV(contracts: LinkedList<Contract>, cleanDir: Boolean = false)
}