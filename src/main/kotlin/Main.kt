import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    val percentСommissionFees = 0.75        //комиссионные сборы 0.75%, но не менее 35 руб
    val minCommission = 35                  //сумма минимальной комиссии
    var amount = 30000.98                   //сумма перевода в копейках 30000 руб., 98 коп.

    var сommission = (amount * percentСommissionFees) / 100

    //округляем сумму комиссии
    var df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    var result = df.format(сommission)

    //проверяем сумму комиссии, она не может быть меньше минимальной комиссии, если меньше то она равна минимальной
    if (сommission < minCommission) {
        сommission = minCommission.toDouble()
    }

    val charRub = '\u20BD'                      //символ рубля
    println("Комиссия составила: $result $charRub")
}