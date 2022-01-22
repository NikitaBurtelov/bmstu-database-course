package bmstu.bd.lab.lab_01.utils.const

data class LabConst(
    var COUNT_INSTITUTION: Int = 1000,
    var COUNT_STUDENTS: Int = 1000,
    var COUNT_GROUP: Int = 30000,
    var PATH: String = "${System.getProperty("user.dir")}/src/main/resources/csv"
)
