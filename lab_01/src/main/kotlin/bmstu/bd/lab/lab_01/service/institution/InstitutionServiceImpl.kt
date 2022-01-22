package bmstu.bd.lab.lab_01.service.institution

import bmstu.bd.lab.lab_01.model.Institution
import bmstu.bd.lab.lab_01.repository.InstitutionRepository
import bmstu.bd.lab.lab_01.utils.fileWriter.CsvFileWriter
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random

@Service
class InstitutionServiceImpl @Autowired constructor(
    private val institutionRepository: InstitutionRepository
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
        val institutions = LinkedList<Institution>()

        for (i in 0..count) institutions.add(createEntityInstitution())

        return institutions
    }

    override fun saveDataBase(institution: Institution) {
        institutionRepository.save(institution)
    }

    override fun saveDataBase(institutions: LinkedList<Institution>) {
        institutionRepository.saveAll(institutions)
    }

    override fun saveCSV(institutions: LinkedList<Institution>, cleanDir: Boolean) {
        CsvFileWriter<Institution>()
            .write(
                institutions,
                Institution::class,
                arrayOf("id", "title", "phone", "address", "rating"),
                cleanDir
            )
    }
}