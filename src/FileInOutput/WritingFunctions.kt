package FileInOutput

import java.io.File
import java.io.PrintWriter

fun main() {

    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "c:\\projects\\hello.txt"

//    val file = File(path)
//    val printWriter = PrintWriter(file)

    File(path).bufferedWriter().use{ it.append(outString)}

//    printWriter.println(outString)
//    printWriter.close()

    val file = File(path)
    file.writeText(outString)
    file.appendText("\nDo great work!")

}