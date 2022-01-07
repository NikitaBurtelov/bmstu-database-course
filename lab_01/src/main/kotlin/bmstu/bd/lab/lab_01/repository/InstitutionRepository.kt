package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Institution
import org.springframework.data.jpa.repository.JpaRepository

interface InstitutionRepository: JpaRepository<String, Institution> {
}