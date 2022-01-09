package bmstu.bd.lab.lab_01.service.institution

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.model.Institution
import java.util.*

interface InstitutionService {
    fun generate()
    fun generate(count: Int)
    fun saveDataBase(contract: Institution)
    fun saveDataBase(contracts: LinkedList<Institution>)
    fun saveCSV(path: String)
    fun saveCSV()
}