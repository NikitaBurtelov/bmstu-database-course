package bmstu.bd.lab.lab_01.service.generator

import bmstu.bd.lab.lab_01.model.Contract
import java.util.*

interface DataGenerator {
    fun generate()
    fun generate(count: Int)
    fun saveDataBase(contract: Contract)
    fun saveDataBase(contracts: LinkedList<Contract>)
    fun saveCSV(path: String)
    fun saveCSV()
}