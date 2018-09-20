class Imperative {


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

    fun convert(number: Int): String {

        var num = number
        var roman = ""
        for (numeral in numerals) {
            while (num >= numeral.value) {
                roman = roman + numeral.symbol
                num -= numeral.value
            }
        }
        return roman
    }


    data class Numeral(val symbol: String , val value:Int)

}
