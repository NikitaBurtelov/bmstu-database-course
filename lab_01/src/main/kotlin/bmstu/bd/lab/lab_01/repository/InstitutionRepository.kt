package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Institution
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InstitutionRepository: JpaRepository<Institution, Int> {
}