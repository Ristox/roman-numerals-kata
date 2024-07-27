package ee.rsx.kata.codurance.romannumerals

class RomanNumber(private val value: Int) {
  override fun toString(): String {
    return if (value == 1) "I" else "II"
  }
}
