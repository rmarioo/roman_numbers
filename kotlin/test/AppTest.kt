
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class AppTest {


    @ParameterizedTest
    @CsvSource(
                "1      ,I"     ,
                "2      ,II"    ,
                "3      ,III"   ,
                "4      ,IV"    ,
                "5      ,V"     ,
                "6      ,VI"    ,
                "9      ,IX"    ,
                "27     ,XXVII" ,
                "48     ,XLVIII",
                "59     ,LIX"   ,
                "93     ,XCIII" ,
                "141    ,CXLI"  ,
                "163    ,CLXIII",
                "402    ,CDII"  ,
                "575    ,DLXXV" ,
                "911    ,CMXI"  ,
                "1024   ,MXXIV" ,
                "3000   ,MMM"
    )
    internal fun `imperative`(input: Int, expected: String) {
        assertThat(Imperative().convert(input), CoreMatchers.`is`(expected))
    }

    @ParameterizedTest
    @CsvSource(
            "1      ,I"     ,
            "2      ,II"    ,
            "3      ,III"   ,
            "4      ,IV"    ,
            "5      ,V"     ,
            "6      ,VI"    ,
            "9      ,IX"    ,
            "27     ,XXVII" ,
            "48     ,XLVIII",
            "59     ,LIX"   ,
            "93     ,XCIII" ,
            "141    ,CXLI"  ,
            "163    ,CLXIII",
            "402    ,CDII"  ,
            "575    ,DLXXV" ,
            "911    ,CMXI"  ,
            "1024   ,MXXIV" ,
            "3000   ,MMM"
    )
    internal fun `functional`(input: Int, expected: String) {
        assertThat(Functional().convert(input), CoreMatchers.`is`(expected))
    }


    @ParameterizedTest
    @CsvSource(
            "1      ,I"     ,
            "2      ,II"    ,
            "3      ,III"   ,
            "4      ,IV"    ,
            "5      ,V"     ,
            "6      ,VI"    ,
            "9      ,IX"    ,
            "27     ,XXVII" ,
            "48     ,XLVIII",
            "59     ,LIX"   ,
            "93     ,XCIII" ,
            "141    ,CXLI"  ,
            "163    ,CLXIII",
            "402    ,CDII"  ,
            "575    ,DLXXV" ,
            "911    ,CMXI"  ,
            "1024   ,MXXIV" ,
            "3000   ,MMM"
    )
    internal fun `functionalComposition`(input: Int, expected: String) {
        assertThat(FunctionalComposition().convert(input), CoreMatchers.`is`(expected))
    }
}
