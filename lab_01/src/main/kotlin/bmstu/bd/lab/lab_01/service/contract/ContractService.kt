package bmstu.bd.lab.lab_01.service.contract

import bmstu.bd.lab.lab_01.model.Contract
import java.util.*

interface ContractService {
    fun generate() : Contract
    fun generate(count: Int) : LinkedList<Contract>
    fun saveDataBase(contract: Contract)
    fun saveDataBase(contracts: LinkedList<Contract>)
    fun saveCSV(path: String)
    fun saveCSV()
}