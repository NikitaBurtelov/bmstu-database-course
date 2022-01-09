package bmstu.bd.lab.lab_01.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "student", schema = "bmstu")
class Student(
    @Id
    @Column(name = "id_student")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idStudent: Int? =  null,
    @OneToOne
    @JoinColumn(name = "id_study_group")
    val idStudyGroup: Group,
    @Column(name = "first_name")
    val firstName: String,
    @Column(name = "last_name")
    val lastName: String,
    @Column(name = "dob")
    val dob: Date,
    @Column(name = "sex")
    val sex: String,
    @Column(name = "email")
    val email: String
) {
}