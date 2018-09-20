package org.samplescala

import org.samplescala.App.toRoman
import org.scalatest.FunSuite


class AppTests extends FunSuite {


  test("one")   { assert(toRoman(1) == "I") }
  test("two")   { assert(toRoman(2) == "II") }
  test("tree")  { assert(toRoman(3) == "III") }
  test("four")  { assert(toRoman(4) == "IV") }
  test("five")  { assert(toRoman(5) == "V") }
  test("six")   { assert(toRoman(6) == "VI") }
  test("seven") { assert(toRoman(7) == "VII") }
  test("eight") { assert(toRoman(8) == "VIII") }
  test("nine")  { assert(toRoman(9) == "IX") }
  test("ten")   { assert(toRoman(10) == "X") }
  test("163")   { assert(toRoman(163) == "CLXIII") }

}