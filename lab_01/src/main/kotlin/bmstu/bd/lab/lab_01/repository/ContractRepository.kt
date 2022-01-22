package bmstu.bd.lab.lab_01.repository

import bmstu.bd.lab.lab_01.model.Contract
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ContractRepository: CrudRepository<Contract, Int>