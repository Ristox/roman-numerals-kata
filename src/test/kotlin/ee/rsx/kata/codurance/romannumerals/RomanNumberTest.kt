package ee.rsx.kata.codurance.romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
  https://www.codurance.com/katas/roman-numerals
 **/

class RomanNumberTest {

  @ParameterizedTest
  @MethodSource("singleValues")
  fun `number $number is roman numeral $roman` (number: Int, roman: String) {
    number.assertIsRomanNumber(roman)
  }

  private fun Int.assertIsRomanNumber(roman: String) {
    assertThat("${RomanNumber(this)}").isEqualTo(roman)
  }

  companion object {
    @JvmStatic
    fun singleValues(): Stream<Arguments> = Stream.of(
      Arguments.of(1, "I"),
      Arguments.of(2, "II"),
      Arguments.of(3, "III"),
      Arguments.of(4, "IV"),
      Arguments.of(5, "V"),
      Arguments.of(6, "VI"),
      Arguments.of(7, "VII"),
      Arguments.of(8, "VIII"),
      Arguments.of(9, "IX"),
    )
  }
}
