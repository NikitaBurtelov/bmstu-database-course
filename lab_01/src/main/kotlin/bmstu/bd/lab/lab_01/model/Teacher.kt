package bmstu.bd.lab.lab_01.model

import java.sql.Date
import javax.persistence.Entity
import javax.persistence.Table

data class Teacher(
    val idTeacher: Int,
    val idInstitution: Int,
    val firstName: String,
    val lastName: String,
    val dob: Date,
    val sex: String,
    val phone: String,
    val education: String


)
