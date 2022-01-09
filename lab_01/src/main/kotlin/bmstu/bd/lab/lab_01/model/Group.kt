package bmstu.bd.lab.lab_01.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "study_group")
data class Group(
    @Id
    @Column(name = "id_group")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idGroup : Int,
    @Column(name = "uid")
    val uid: UUID
)