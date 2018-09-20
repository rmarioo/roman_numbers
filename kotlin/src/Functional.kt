class Functional {


    val numerals = listOf(
            Numeral("M", 1000),
            Numeral("CM", 900),
            Numeral("D", 500),
            Numeral("CD", 400),
            Numeral("C", 100),
            Numeral("XC", 90),
            Numeral("L", 50),
            Numeral("XL", 40),
            Numeral("X", 10),
            Numeral("IX", 9),
            Numeral("V", 5),
            Numeral("IV", 4),
            Numeral("I", 1)
    )

    fun convert(number: Int): String = recursiveConvert(number, 0, "")


    private fun recursiveConvert(reminder: Int, index: Int, roman: String): String {
        if (reminder == 0)
            return roman
        else {
            val numeral = numerals.get(index)
            return if (reminder >= numeral.value)
                 recursiveConvert(reminder - numeral.value, index, roman + numeral.symbol)
            else recursiveConvert(reminder, index + 1, roman)
        }
    }


    data class Numeral(val symbol: String, val value: Int)

}
