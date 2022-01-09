package bmstu.bd.lab.lab_01.model

import javax.persistence.*

@Entity
@Table(name = "institution", schema = "bmstu")
data class Institution(
    @Id
    @Column(name = "id_contract")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idInstitution: Int,
    @Column(name = "title")
    val title: String,
    @Column(name = "phone")
    val phone: String,
    @Column(name = "addres")
    val address: String,
    @Column(name = "rating")
    val rating: Int
)
