package bmstu.bd.lab.lab_01.model

import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.sql.Date

@Table
data class Student(
    @Column("id_student")
    val id_student: Int,
    @Column
    val id_study_group: Int,
    @Column
    val first_name: String,
    val last_name: String,
    val dob: Date,
    val sex: String,
    val email: String
) {
}