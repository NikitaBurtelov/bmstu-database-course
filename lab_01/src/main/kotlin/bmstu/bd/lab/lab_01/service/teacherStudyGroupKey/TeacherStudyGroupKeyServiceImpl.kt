package bmstu.bd.lab.lab_01.service.teacherStudyGroupKey

import bmstu.bd.lab.lab_01.model.Group
import bmstu.bd.lab.lab_01.model.Teacher
import bmstu.bd.lab.lab_01.model.TeacherStudyGroupKey
import bmstu.bd.lab.lab_01.repository.TeacherStudyGroupKeyRepository
import bmstu.bd.lab.lab_01.utils.fileWriter.CsvFileWriter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random

@Service
class TeacherStudyGroupKeyServiceImpl @Autowired constructor(
    private val teacherStudyGroupKeyRepository: TeacherStudyGroupKeyRepository
): TeacherStudyGroupKeyService {

    override fun createEntityTeacherStudyGroupKey(teacher: Teacher, group: Group): TeacherStudyGroupKey {
        TODO("Not yet implemented")
    }

    override fun createEntityTeacherStudyGroupKey(
        teachers: LinkedList<Teacher>,
        groups: LinkedList<Group>
    ): LinkedList<TeacherStudyGroupKey> {
        val teacherStudyGroupKeys = LinkedList<TeacherStudyGroupKey>()

        groups.forEach { group ->
            val countTeacher = Random.nextInt(3, 8)

            for (i in 0..countTeacher) {
                val id = Random.nextInt(0, teachers.size)

                teacherStudyGroupKeys.add(
                    TeacherStudyGroupKey(
                        idGroup = group,
                        idTeacher = teachers[id]
                    )
                )
            }
        }

        return teacherStudyGroupKeys
    }

    override fun saveDataBase(teacherStudyGroupKey: TeacherStudyGroupKey) {
       teacherStudyGroupKeyRepository.save(teacherStudyGroupKey)
    }

    override fun saveDataBase(teacherStudyGroupKeys: LinkedList<TeacherStudyGroupKey>) {
        teacherStudyGroupKeyRepository.saveAll(teacherStudyGroupKeys)
    }

    override fun saveCSV(teacherStudyGroupKeys: LinkedList<TeacherStudyGroupKey>, cleanDir: Boolean) {
        CsvFileWriter<TeacherStudyGroupKey>()
            .write(
                teacherStudyGroupKeys,
                TeacherStudyGroupKey::class,
                arrayOf("id", "title", "phone", "address", "rating"),
                cleanDir
            )
    }

    override fun saveCSV() {
        TODO("Not yet implemented")
    }

}