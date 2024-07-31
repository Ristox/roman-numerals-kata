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

  private val arabicToRomanLiteral: LinkedHashMap<Int, String> = linkedMapOf(
    1000 to "M",
    500 to "D",
    100 to "C",
    50 to "L",
    10 to "X",
    5 to "V",
    1 to "I"
  )

  override fun toString(): String = toRomanNumeral(value)

  private fun toRomanNumeral(value: Int, fromIndex: Int = 0): String {
    if (value == 0) return ""

    val arabic = arabicAt(fromIndex)
    val remainder = value % arabic

    if (fromIndex > 0) {
      val previousArabic = arabicAt(fromIndex - 1)
      if (value >= 4 * arabic) {
        return arabic.asRomanLiteral() + previousArabic.asRomanLiteral() + toRomanNumeral(remainder, fromIndex + 1)
      }

      if (fromIndex < arabicToRomanLiteral.size - 1) {
        val nextArabic = arabicAt(fromIndex + 1)
        if (value >= 9 * nextArabic) {
          val reducedValue = value - (previousArabic - nextArabic)
          return nextArabic.asRomanLiteral() + previousArabic.asRomanLiteral() + toRomanNumeral(reducedValue, fromIndex + 1)
        }
      }
    }

    val multiplier = (value - remainder) / arabic
    return arabic.asRomanLiteral(multiplier) + toRomanNumeral(remainder, fromIndex + 1)
  }

  private fun arabicAt(index: Int) =
    arabicToRomanLiteral.keys.elementAt(index)

  private fun Int.asRomanLiteral(times: Int? = null) =
    arabicToRomanLiteral.getValue(this).repeat(times ?: 1)
}
