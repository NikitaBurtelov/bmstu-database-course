package bmstu.bd.lab.lab_01.service.institution

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.model.Institution
import java.util.*

interface InstitutionService {
    fun createEntityInstitution() : Institution
    fun createEntityInstitution(count: Int) : LinkedList<Institution>
    fun saveDataBase(institution: Institution)
    fun saveDataBase(institution: LinkedList<Institution>)
    fun saveCSV(path: String)
    fun saveCSV()
}