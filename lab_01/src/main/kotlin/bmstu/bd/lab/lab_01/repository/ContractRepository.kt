package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Contract
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContractRepository: JpaRepository<Contract, Int>
