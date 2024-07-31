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
    val remainder = value % arabic

    if (fromIndex > 0) {
      val previousArabic = arabicAt(fromIndex - 1)
      if (value >= 4 * arabic) {
        return arabic.asRoman() + previousArabic.asRoman() + toRoman(remainder, fromIndex + 1)
      }

      if (fromIndex < arabicToRomanNumber.size - 1) {
        val nextArabic = arabicAt(fromIndex + 1)
        if (value >= 9 * nextArabic) {
          val reducedValue = value - (previousArabic - nextArabic)
          return nextArabic.asRoman() + previousArabic.asRoman() + toRoman(reducedValue, fromIndex + 1)
        }
      }
    }

    val multiplier = (value - remainder) / arabic
    return arabic.asRoman().repeat(multiplier) + toRoman(remainder, fromIndex + 1)
  }

  private fun arabicAt(index: Int) =
    arabicToRomanNumber.keys.elementAt(index)

  private fun Int.asRoman(times: Int? = null) =
    arabicToRomanNumber.getValue(this).repeat(times ?: 1)
}
