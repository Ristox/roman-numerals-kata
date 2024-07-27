package ee.rsx.kata.codurance.romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

/**
  https://www.codurance.com/katas/shopping-cart-kata
 **/

class RomanNumberTest {

  @Test
  fun `converts arabic number 1 to I`() {
    assertThat(RomanNumber(1).toString()).isEqualTo("I")
  }

}
