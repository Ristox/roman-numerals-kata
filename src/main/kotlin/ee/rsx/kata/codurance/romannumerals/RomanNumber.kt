package ee.rsx.kata.codurance.romannumerals

class RomanNumber(private val value: Int) {

  init {
    require(value != 0) {
      "Value of 0 (zero) is an illegal roman numeral"
    }
  }

  private val arabicToRomanNumber = linkedMapOf(
    1 to "I",
    5 to "V",
    10 to "X"
  )

  override fun toString(): String {

    return when {
      value < 4 -> 1.asRoman().repeat(value)
      value == 4 -> 1.asRoman() + 5.asRoman()
      value == 5 -> 5.asRoman()
      value < 9 -> 5.asRoman() + 1.asRoman().repeat(value - 5)
      value == 9 -> 1.asRoman() + 10.asRoman()
      else -> ""
    }
  }

  private fun Int.asRoman() = arabicToRomanNumber.getValue(this)
}
