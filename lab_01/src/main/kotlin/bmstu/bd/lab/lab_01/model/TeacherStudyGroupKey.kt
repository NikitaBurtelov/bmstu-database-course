package bmstu.bd.lab.lab_01.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "teacher_study_group", schema = "bmstu")
class TeacherStudyGroupKey (
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    @JoinColumn(name = "id_teacher")
    @OneToMany
    val idTeacher: LinkedList<Teacher>,
    @JoinColumn(name = "id_study_group")
    @OneToMany
    val idGroup: LinkedList<Group>,
)