package bmstu.bd.lab.lab_01.model

import javax.persistence.*

@Entity
@Table(name = "teacher_study_group", schema = "bmstu")
class TeacherStudyGroupKey (
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    @JoinColumn(name = "id_teacher")
    @ManyToOne
    var idTeacher: Teacher,
    @JoinColumn(name = "id_group")
    @ManyToOne
    var idGroup: Group,
): Model {
    fun group(group: Group) {
        this.idGroup = group
    }

    fun group() : Group {
        return this.idGroup
    }

    fun teacher(teacher: Teacher) {
        this.idTeacher = teacher
    }

    fun teacher(): Group {
        return this.idGroup
    }
}