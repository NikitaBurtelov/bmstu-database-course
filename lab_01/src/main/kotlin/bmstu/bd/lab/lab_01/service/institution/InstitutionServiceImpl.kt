package bmstu.bd.lab.lab_01.service.institution

import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.repository.InstitutionRepository
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random

@Service
class InstitutionServiceImpl @Autowired constructor(
    val institutionRepository: InstitutionRepository
) : InstitutionService {
    private val faker = Faker.instance()

    override fun createEntityInstitution() : Institution {
        return Institution(
            title = faker.university().name(),
            phone = faker.phoneNumber().phoneNumber(),
            address = faker.address().city(),
            rating = Random.nextInt(1, 100)
        )
    }

    override fun createEntityInstitution(count: Int) : LinkedList<Institution> {
        val entities = LinkedList<Institution>()

        for (i in 0..count) entities.add(createEntityInstitution())

        return entities
    }

    override fun saveDataBase(institution: Institution) {
        institutionRepository.save(institution)
    }

    override fun saveDataBase(institution: LinkedList<Institution>) {
        institutionRepository.saveAll(institution)
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}