package bmstu.bd.lab.lab_01.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "study_group", schema = "bmstu")
class Group(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idGroup: Int? = null,
    @Column(name = "uid")
    val uid: UUID
): Model