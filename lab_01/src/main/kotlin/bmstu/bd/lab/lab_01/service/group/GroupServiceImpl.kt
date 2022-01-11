package bmstu.bd.lab.lab_01.service.group

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Student
import bmstu.bd.lab.lab_01.repository.GroupRepository
import com.github.javafaker.Faker
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class GroupServiceImpl @Autowired constructor(
    val groupRepository: GroupRepository
): GroupService {
    override fun createEntityGroup(students: LinkedList<Student>): Group {
        val group =  Group(
            uid = UUID.randomUUID()
        )

        for (student in students)
            student.idStudyGroup = group

        return group
    }

    override fun saveDataBase(group: Group) {
        groupRepository.save(group)
    }

    override fun saveDataBase(groups: LinkedList<Group>) {
        groupRepository.saveAll(groups)
    }

    override fun saveCSV(path: String) {
        TODO("Not yet implemented")
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }
}