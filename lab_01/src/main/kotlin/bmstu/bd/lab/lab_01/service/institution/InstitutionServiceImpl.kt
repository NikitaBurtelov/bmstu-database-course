package bmstu.bd.lab.lab_01.service.institution

import bmstu.bd.lab.lab_01.repository.InstitutionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class InstitutionServiceImpl @Autowired constructor(
    val institutionRepository: InstitutionRepository
) {
}