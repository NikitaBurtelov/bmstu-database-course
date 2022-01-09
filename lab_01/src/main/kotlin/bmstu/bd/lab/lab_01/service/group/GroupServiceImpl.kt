package bmstu.bd.lab.lab_01.service.group

import bmstu.bd.lab.lab_01.repository.GroupRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GroupServiceImpl @Autowired constructor(
    val groupRepository: GroupRepository
) {
}