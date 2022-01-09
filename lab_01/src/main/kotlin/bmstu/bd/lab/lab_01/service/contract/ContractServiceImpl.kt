package bmstu.bd.lab.lab_01.service.contract

import bmstu.bd.lab.lab_01.model.Contract
import bmstu.bd.lab.lab_01.repository.ContractRepository
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.contracts.contract


@Service
class ContractServiceImpl @Autowired constructor(
    val contractRepository: ContractRepository
) : ContractService {
    var faker = Faker()

    var streetName = faker.address().streetName()
    var number = faker.address().buildingNumber()
    var city = faker.address().city()
    var country = faker.address().country()
    var firstName = faker.name().firstName()
    var lastName = faker.name().lastName()

    override fun generate() : Contract{
//        val contract = Contract(
//            serviceCost = faker
//        )
//        return { contract: Contract ->
//            contract.serviceCost = 100
//        }
        TODO("Not yet implemented")
    }

    override fun generate(count: Int): LinkedList<Contract> {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(contract: Contract) {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(contracts: LinkedList<Contract>) {
        TODO("Not yet implemented")
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}