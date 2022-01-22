package bmstu.bd.lab.lab_01.utils.ui

import org.springframework.stereotype.Component

@Component
class ProgressBar: Thread() {
    private var showProgress = true

    override fun run() {
        val anim = "|/-\\"
        var x = 0
        while (showProgress) {
            print("\r Processing " + anim[x++ % anim.length])
            try {
                sleep(100)
            } catch (e: Exception) {
            }
        }
    }

    fun showStop() {
        showProgress = false
    }
}