package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Group
import org.springframework.data.jpa.repository.JpaRepository

interface GroupRepository: JpaRepository<String, Group> {
}