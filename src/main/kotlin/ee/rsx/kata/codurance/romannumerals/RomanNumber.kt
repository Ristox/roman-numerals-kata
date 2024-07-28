package ee.rsx.kata.codurance.romannumerals

class RomanNumber(private val value: Int) {

  init {
    require(value > 0) {
      "Value of $value is an illegal roman numeral"
    }
  }

  private val arabicToRomanNumber = linkedMapOf(
    1 to "I",
    5 to "V",
    10 to "X"
  )

  override fun toString(): String {
    return when {
      value < 4 -> 1.asRoman(times = value)
      value <= 5 -> 1.asRoman(times = 5 - value) + 5.asRoman()
      value < 9 -> 5.asRoman() + 1.asRoman(times = value - 5)
      value == 9 -> 1.asRoman() + 10.asRoman()

      value <= 13 -> 10.asRoman() + 1.asRoman(times = value - 10)
      value <= 15 -> 10.asRoman() + 1.asRoman(times = 15 - value) + 5.asRoman()
      value < 19 -> 10.asRoman() + 5.asRoman() + 1.asRoman(times = value - 15)
      value == 19 -> 10.asRoman() + 1.asRoman() + 10.asRoman()
      else -> ""
    }
  }

  private fun Int.asRoman(times: Int? = null) =
    arabicToRomanNumber.getValue(this).repeat(times ?: 1)
}
