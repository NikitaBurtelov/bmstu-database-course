package bmstu.bd.lab.lab_01.service.contract

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.model.Student
import bmstu.bd.lab.lab_01.repository.ContractRepository
import bmstu.bd.lab.lab_01.utils.date.DateUtil
import bmstu.bd.lab.lab_01.utils.fileWriter.CsvFileWriter
import com.github.javafaker.Faker
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.sql.Date
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random


@Service
class ContractServiceImpl @Autowired constructor(
    private val contractRepository: ContractRepository
) : ContractService {
    private val faker = Faker.instance()
    private val log = KotlinLogging.logger {}

    override fun createEntityContract(student: Student) : Contract{
        val dateOfConclusion = Date(faker.date().past(1000, TimeUnit.DAYS).time)
        val startOfTraining = DateUtil().addDays(dateOfConclusion, 1)
        val endOfTraining = DateUtil().addDays(dateOfConclusion, 5)

        return Contract(
            dateOfConclusion = dateOfConclusion,
            serviceCost = Random.nextDouble(),
            idStudent = student,
            startOfTraining = startOfTraining,
            endOfTraining = endOfTraining
        )
    }

    override fun createEntityContract(
        students: LinkedList<Student>
    ): LinkedList<Contract> {
        val contracts = LinkedList<Contract>()

        for (student in students)
            contracts.add(createEntityContract(student))

        return contracts
    }

    override fun saveDataBase(contract: Contract) {
        contractRepository.save(contract)
    }

    override fun saveDataBase(contracts: LinkedList<Contract>) {
        contractRepository.saveAll(contracts)
    }

    override fun saveCSV(contracts: LinkedList<Contract>, cleanDir: Boolean) {
        CsvFileWriter<Contract>()
            .write(
                contracts,
                Contract::class,
                arrayOf("id", "id_student", "date_of_conclusion", "start_of_training", "end_of_training", "service_cost"),
                //arrayOf("idContract", "idStudent", "dateOfConclusion", "startOfTraining", "endOfTraining", "service_cost"),
                cleanDir
            )
    }
}