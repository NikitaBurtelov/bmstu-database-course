package bmstu.bd.lab.lab_01.utils.ui

import mu.KotlinLogging
import org.springframework.stereotype.Component

@Component
class Ui {
    private val log = KotlinLogging.logger {}

    fun bmstuLogo() {
        println("\n" +
                "         *     (                  \n" +
                "   (   (  `    )\\ )  *   )        \n" +
                " ( )\\  )\\))(  (()/(` )  /(    (   \n" +
                " )((_)((_)()\\  /(_))( )(_))   )\\  \n" +
                "((_)_ (_()((_)(_)) (_(_()) _ ((_) \n" +
                " | _ )|  \\/  |/ __||_   _|| | | | \n" +
                " | _ \\| |\\/| |\\__ \\  | |  | |_| | \n" +
                " |___/|_|  |_||___/  |_|   \\___/  \n" +
                "                                  \n")
    }

    fun appLogo() {
        println("" +
                " (                           \n" +
                " )\\ )         )       )   )  \n" +
                "(()/(    ) ( /(    ( /(( /(  \n" +
                " /(_))( /( )\\())   )\\())\\()) \n" +
                "(_))  )(_)|(_)\\   ((_)((_)\\  \n" +
                "| |  ((_)_| |(_)  /  (_) (_) \n" +
                "| |__/ _` | '_ \\ | () || |   \n" +
                "|____\\__,_|_.__/  \\__/ |_|   \n" +
                "                             ")
    }
}