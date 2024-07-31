package ee.rsx.kata.codurance.romannumerals

class RomanNumber(private val value: Int) {

  init {
    require(value > 0) {
      "Value of $value is an illegal roman numeral"
    }

    require(value < 6000) {
      "Value of $value is not supported (maximum is 5999)"
    }
  }

  private val arabicToRomanNumber: LinkedHashMap<Int, String> = linkedMapOf(
    1000 to "M",
    500 to "D",
    100 to "C",
    50 to "L",
    10 to "X",
    5 to "V",
    1 to "I"
  )

  override fun toString(): String {
    return toRoman(value)
  }

  private fun toRoman(value: Int, fromIndex: Int = 0): String {
    if (value == 0) return ""

    val arabic = arabicAt(fromIndex)
    val roman = arabic.asRoman()

    val remainder = value % arabic

    if (fromIndex > 0) {
      if (value >= arabic * 4) {
        val previousArabic = arabicAt(fromIndex - 1)
        return arabic.asRoman() + previousArabic.asRoman() + toRoman(remainder, fromIndex + 1)
      }
    }

    if (value == 9) {
      return 1.asRoman() + 10.asRoman()
    }

    if (value in 90..99) {
      return 10.asRoman() + 100.asRoman() + toRoman(value - 90, fromIndex + 1)
    }


    if (value in 900..999) {
      return 100.asRoman() + 1000.asRoman() + toRoman(value - 900, fromIndex + 1)
    }

    val multiplier = (value - remainder) / arabic
    return roman.repeat(multiplier) + toRoman(remainder, fromIndex + 1)
  }

  private fun arabicAt(index: Int) =
    arabicToRomanNumber.keys.elementAt(index)

  private fun Int.asRoman(times: Int? = null) =
    arabicToRomanNumber.getValue(this).repeat(times ?: 1)
}
