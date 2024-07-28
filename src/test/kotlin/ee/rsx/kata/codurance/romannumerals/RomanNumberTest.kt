package ee.rsx.kata.codurance.romannumerals

import org.assertj.core.api.Assertions.assertThat
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
      "Value of 0 is an illegal roman numeral",
      test
    )
  }

  @Test
  fun `negative value (ie -10) is an illegal roman numeral`() {
    val test: () -> Unit = { RomanNumber(-10) }

    assertFailsWith<IllegalArgumentException>(
      "Value of 10 is an illegal roman numeral",
      test
    )
  }

  @ParameterizedTest
  @MethodSource("singleValues")
  fun `single number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("teenValues")
  fun `teen number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("twentiesValues")
  fun `twenties number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  private fun Int.assertIsRomanNumeral(roman: String) {
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

    @JvmStatic
    fun teenValues(): Stream<Arguments> = Stream.of(
      Arguments.of(10, "X"),
      Arguments.of(11, "XI"),
      Arguments.of(12, "XII"),
      Arguments.of(13, "XIII"),
      Arguments.of(14, "XIV"),
      Arguments.of(15, "XV"),
      Arguments.of(16, "XVI"),
      Arguments.of(17, "XVII"),
      Arguments.of(18, "XVIII"),
      Arguments.of(19, "XIX")
    )

    @JvmStatic
    fun twentiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(20, "XX"),
      Arguments.of(21, "XXI"),
      Arguments.of(22, "XXII"),
      Arguments.of(23, "XXIII"),
      Arguments.of(24, "XXIV"),
      Arguments.of(25, "XXV"),
      Arguments.of(26, "XXVI"),
      Arguments.of(27, "XXVII"),
      Arguments.of(28, "XXVIII"),
      Arguments.of(29, "XXIX"),
    )
  }
}

