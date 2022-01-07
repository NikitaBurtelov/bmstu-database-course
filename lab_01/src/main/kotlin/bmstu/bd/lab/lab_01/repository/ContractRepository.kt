package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Contract
import org.springframework.data.jpa.repository.JpaRepository

interface ContractRepository: JpaRepository<String, Contract>
