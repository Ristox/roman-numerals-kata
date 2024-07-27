package ee.rsx.kata.codurance.romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
  https://www.codurance.com/katas/roman-numerals
 **/

class RomanNumberTest {

  @Test
  fun `number 1 is roman numeral 'I'`() {
    1.assertIsRomanNumber("I")
  }

  @Test
  fun `number 2 is roman numeral 'II'`() {
    2.assertIsRomanNumber("II")
  }

  private fun Int.assertIsRomanNumber(roman: String) {
    assertThat("${RomanNumber(this)}").isEqualTo(roman)
  }

}
