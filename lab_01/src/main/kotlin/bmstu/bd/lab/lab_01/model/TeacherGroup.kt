package bmstu.bd.lab.lab_01.model

import javax.persistence.*

@Entity
@Table(name = "teacher_study_group")
class TeacherAndGroupTableKey (
    @Id
    @Column(name = "id", nullable = false)
    var id: Int? = null,
    @JoinColumn(name = "id_teacher")
    @ManyToMany
    val id_teacher: List<Teacher>,
    @JoinColumn(name = "id_group")
    @ManyToMany
    val id_group: List<Group>
)