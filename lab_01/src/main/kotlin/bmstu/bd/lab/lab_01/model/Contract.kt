package bmstu.bd.lab.lab_01.model

import javax.persistence.*
import org.postgresql.util.PGInterval
import java.lang.reflect.Constructor
import java.sql.Date

@Entity
@Table(name = "contract", schema = "bmstu")
class Contract(
    @Id
    @Column(name = "id_contract")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idContract: Int = 0,
    @JoinColumn(name = "id_institution")
    @OneToOne
    val idInstitution: Institution,
    @JoinColumn(name = "id_student")
    @OneToOne
    val idStudent: Student,
    @Column(name = "date_of_conclusion")
    val dateOfConclusion: Date,
    @Column(name = "training_period")
    val trainingPeriod: PGInterval,
    @Column(name = "service_cost")
    val serviceCost: Int
)