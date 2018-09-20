class FunctionalComposition {

    data class Numeral(val symbol: String, val value: Int)

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

    fun convert(number: Int): String
    {
        return  (::createNumeralSequence `|` ::concatSymbols)(number)
    }

    fun createNumeralSequence(number: Int) = sequenceOf(number, { numeral -> findMatchingNumeral(numeral) })

    fun concatSymbols(sequence: Sequence<Numeral>)= sequence.map { it.symbol }.joinToString("")

    fun sequenceOf(number: Int, nextFunction: (Numeral) -> Numeral?) =
            generateSequence(Numeral("", number), nextFunction)

    fun findMatchingNumeral(input: Numeral): Numeral? {

        return numerals.asSequence()
                .filter { numeral -> input.value >= numeral.value }
                .map { numeral -> Numeral(numeral.symbol ,input.value - numeral.value) }
                .firstOrNull()
    }

}

public infix fun <V, T, R> ((V) -> T).`|`(after: Function1<T, R>): (V) -> R {
    return { v: V -> after(this(v)) }
}



