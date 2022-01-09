package bmstu.bd.lab.lab_01.service.teacher

import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.repository.TeacherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class TeacherServiceImpl @Autowired constructor(
    val teacherRepository: TeacherRepository
) : TeacherService{
    override fun generate() {
        TODO("Not yet implemented")
    }

    override fun generate(count: Int) {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(contract: Institution) {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(contracts: LinkedList<Institution>) {
        TODO("Not yet implemented")
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}