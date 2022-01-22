package bmstu.bd.lab.lab_01.utils.fileWriter

import bmstu.bd.lab.lab_01.model.Model
import bmstu.bd.lab.lab_01.utils.const.LabConst
import org.springframework.stereotype.Component
import org.supercsv.io.CsvBeanWriter
import org.supercsv.prefs.CsvPreference
import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.reflect.KClass

@Component
class CsvFileWriter <T: Model> {
    fun write(entity: LinkedList<T>, entityClass: KClass<T>, csvHeader: Array<String>, clean: Boolean = false) {
        if (clean)
            deleteAllFilesFolder()

        val writer = FileWriter(
            File(
                LabConst().PATH,
                "${entityClass.simpleName}_${
                    SimpleDateFormat("yyyy-MM-dd_HH-mm")
                        .format(
                            Date()
                        )
                }.csv"
            ),
            true
        )

        val nameMapping = nameMapping(entityClass)

        val csvWriter = CsvBeanWriter(writer, CsvPreference.STANDARD_PREFERENCE)

        csvWriter.writeHeader(*csvHeader)

        //TODO реализовать в модел метод, который будет возвращать id а не ссылку на объект

        entity.forEach { e ->
            //TODO реалзиовать создание листа, с вставкой id
            csvWriter.write(e, *nameMapping)
        }

        csvWriter.close()
    }

    fun deleteAllFilesFolder() {
        try {
            File(LabConst().PATH).listFiles()!!.forEach { file->
                if (file.isFile) file.delete()
            }
        }
        catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @Throws(IOException::class)
    fun nameMapping(entityClass: KClass<T>): Array<String> {
        val parameterNames = LinkedList<String>()
        val declaredConstructors = entityClass.java.declaredConstructors.last()

        declaredConstructors.parameters.forEach { parameter ->
            parameterNames.add(parameter.name)
        }

        return parameterNames.toTypedArray()
    }
}