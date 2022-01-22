package bmstu.bd.lab.lab_01.service.group

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.repository.GroupRepository
import bmstu.bd.lab.lab_01.utils.fileWriter.CsvFileWriter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class GroupServiceImpl @Autowired constructor(
    private val groupRepository: GroupRepository
): GroupService {
    override fun createEntityGroup(): Group {
        return Group(
            uid = UUID.randomUUID()
        )
    }

    override fun createEntityGroup(count: Int): LinkedList<Group> {
        val groups = LinkedList<Group>()

        for (i in 0..count) {
            groups.add(createEntityGroup())
        }

        return groups
    }

    override fun saveDataBase(group: Group) {
        groupRepository.save(group)
    }

    override fun saveDataBase(groups: LinkedList<Group>) {
        groupRepository.saveAll(groups)
    }

    override fun saveCSV(groups: LinkedList<Group>, cleanDir: Boolean) {
        CsvFileWriter<Group>()
            .write(
                groups,
                Group::class,
                arrayOf("id", "title", "phone", "address", "rating"),
                cleanDir
            )
    }
}