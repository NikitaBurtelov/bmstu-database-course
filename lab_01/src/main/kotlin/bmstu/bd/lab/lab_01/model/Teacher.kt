package bmstu.bd.lab.lab_01.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "teacher", schema = "bmstu")
class Teacher(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idTeacher: Int? = null,
    @JoinColumn(name = "id_institution")
    @OneToOne
    val idInstitution: Institution,
    @Column(name = "first_name")
    val firstName: String,
    @Column(name = "last_name")
    val lastName: String,
    @Column(name = "dob")
    val dob: Date,
    @Column(name = "sex")
    val sex: String,
    @Column(name = "phone")
    val phone: String,
    @Column(name = "education")
    val education: String
): Model
