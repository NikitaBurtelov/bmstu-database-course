package bmstu.bd.lab.lab_01.model

import javax.persistence.*

@Entity
@Table(name = "institution", schema = "bmstu")
class Institution(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE)
    val idInstitution: Int? = null,
    @Column(name = "title")
    val title: String,
    @Column(name = "phone")
    val phone: String,
    @Column(name = "address")
    val address: String,
    @Column(name = "rating")
    val rating: Int
): Model {
    fun getTitle(): Int? {
        return this.idInstitution
    }
}
