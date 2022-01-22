package bmstu.bd.lab.lab_01.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "student", schema = "bmstu")
class Student(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idStudent: Int? =  null,
    @ManyToOne
    @JoinColumn(name = "id_study_group")
    var idStudyGroup: Group?,
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
): Model