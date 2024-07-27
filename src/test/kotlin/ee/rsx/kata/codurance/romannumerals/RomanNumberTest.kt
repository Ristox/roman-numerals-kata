package ee.rsx.kata.codurance.romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
  https://www.codurance.com/katas/shopping-cart-kata
 **/

class RomanNumberTest {

  @Test
  fun `number 1 is roman numeral 'I'`() {
    1.assertIsRomanNumber("I")
  }

  private fun Int.assertIsRomanNumber(roman: String) {
    assertThat("${RomanNumber(this)}").isEqualTo(roman)
  }

}
