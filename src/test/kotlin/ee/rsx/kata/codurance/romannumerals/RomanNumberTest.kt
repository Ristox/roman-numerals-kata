package ee.rsx.kata.codurance.romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.Test
import kotlin.test.assertFailsWith

/**
  https://www.codurance.com/katas/roman-numerals
 **/

class RomanNumberTest {


  @Test
  fun `value of 0 (zero) is an illegal roman numeral`() {
    val test: () -> Unit = { RomanNumber(0) }

    assertFailsWith<IllegalArgumentException>(
      "Value of 0 (zero) is an illegal roman numeral",
      test
    )
  }

  @ParameterizedTest
  @MethodSource("singleValues")
  fun `single number is a roman numeral of` (number: Int, roman: String) {
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
