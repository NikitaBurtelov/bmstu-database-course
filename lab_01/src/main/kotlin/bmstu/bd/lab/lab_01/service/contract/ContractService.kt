package bmstu.bd.lab.lab_01.service.contract

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Student
import java.util.*

interface ContractService {
    fun createEntityContract(student: Student, institution: Institution) : Contract
    fun createEntityTeacher(count: Int) : LinkedList<Contract>
    fun saveDataBase(contract: Contract)
    fun saveDataBase(contracts: LinkedList<Contract>)
    fun saveCSV(path: String)
    fun saveCSV()
}