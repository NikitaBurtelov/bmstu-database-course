package bmstu.bd.lab.lab_01.service.contract

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.model.Student
import bmstu.bd.lab.lab_01.repository.ContractRepository
import com.github.javafaker.Faker
import org.postgresql.util.PGInterval
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.sql.Date
import java.util.*
import kotlin.random.Random


@Service
class ContractServiceImpl @Autowired constructor(
    val contractRepository: ContractRepository
) : ContractService {
    val faker = Faker.instance()

    override fun createEntityContract(student: Student, institution: Institution) : Contract{
        return Contract(
            dateOfConclusion = faker.date() as Date,
            trainingPeriod = PGInterval("${Random.nextInt(1, 4)} years"),
            serviceCost = Random.nextInt(),
            idInstitution = institution,
            idStudent = student
        )
    }

    override fun createEntityTeacher(count: Int): LinkedList<Contract> {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(contract: Contract) {
        contractRepository.save(contract)
    }

    override fun saveDataBase(contracts: LinkedList<Contract>) {
        contractRepository.saveAll(contracts)
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}