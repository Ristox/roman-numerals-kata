package ee.rsx.kata.codurance.romannumerals

class RomanNumber(private val value: Int) {
  override fun toString(): String {
    return when (value) {
      1 -> "I"
      else -> "II"
    }
  }
}
