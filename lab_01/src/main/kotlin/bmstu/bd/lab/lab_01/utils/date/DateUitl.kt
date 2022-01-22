package bmstu.bd.lab.lab_01.utils.date

import java.util.*
import java.sql.Date as DateSQL

class DateUtil {
    fun addDays(date: DateSQL, year: Int, days: Int = 0): DateSQL {
        val calendar = Calendar.getInstance()
        calendar.time = date
        calendar.add(Calendar.YEAR, year)
        calendar.add(Calendar.DATE, days)
        return DateSQL(calendar.time.time)
    }

    fun subtractDays(date: DateSQL, year: Int, days: Int = 0): DateSQL {
        val calendar = Calendar.getInstance()
        calendar.time = date
        calendar.add(Calendar.YEAR, -year)
        calendar.add(Calendar.DATE, -days)
        return DateSQL(calendar.time.time)
    }
}