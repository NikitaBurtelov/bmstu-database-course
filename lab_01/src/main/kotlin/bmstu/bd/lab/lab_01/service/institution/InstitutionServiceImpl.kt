package bmstu.bd.lab.lab_01.service.institution

import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.repository.InstitutionRepository
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class InstitutionServiceImpl @Autowired constructor(
    val institutionRepository: InstitutionRepository
) : InstitutionService {
    private val faker = Faker.instance()

    override fun generate() : Institution {
        return Institution(
            title = faker.university().name(),
            phone = faker.phoneNumber().phoneNumber(),
            address = faker.address().city(),
            rating = 1
        )
    }

    override fun generate(count: Int) : LinkedList<Institution> {
        TODO("Not yet implemented")
    }

    override fun saveDataBase(institution: Institution) {
        institutionRepository.save(institution)
    }

    override fun saveDataBase(institution: LinkedList<Institution>) {
        TODO("Not yet implemented")
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}