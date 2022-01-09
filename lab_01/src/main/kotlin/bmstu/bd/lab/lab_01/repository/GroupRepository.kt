package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Group
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GroupRepository: JpaRepository<Group, Int> {
}