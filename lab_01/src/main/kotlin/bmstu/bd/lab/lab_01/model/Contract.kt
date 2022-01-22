package bmstu.bd.lab.lab_01.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "contract", schema = "bmstu")
class Contract(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idContract: Int? = null,
    @JoinColumn(name = "id_student")
    @OneToOne
    val idStudent: Student,
    @Column(name = "date_of_conclusion")
    val dateOfConclusion: Date,
    @Column(name = "start_of_training")
    val startOfTraining: Date,
    @Column(name = "end_of_training")
    val endOfTraining: Date,
    @Column(name = "service_cost")
    val serviceCost: Double,
) : Model