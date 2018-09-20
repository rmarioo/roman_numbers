package org.samplescala

import org.samplescala.Models.Numeral

object App {

  var numerals = List(

    Numeral(1000,"M"),
    Numeral(900,"CM"),
    Numeral(500,"D"),
    Numeral(400,"CD"),
    Numeral(100,"C"),
    Numeral(90,"XC"),
    Numeral(50,"L" ),
    Numeral(40,"XL"),
    Numeral(10,"X"),
    Numeral(9, "IX"),
    Numeral(5, "V"),
    Numeral(4, "IV"),
    Numeral(1,  "I")
  )

  def toRoman(num: Int): String = {
    findAndNextRecursive(num,Numeral(num, ""),"")
  }

  private def findAndNextRecursive(num: Int,numeral: Numeral,acc: String): String =
  {
   if (num ==0)
     acc
    else {
      val res = numerals.find(n => num >= n.num).get
      return findAndNextRecursive(num - res.num,res, acc + res.str)

    }
  }
}
