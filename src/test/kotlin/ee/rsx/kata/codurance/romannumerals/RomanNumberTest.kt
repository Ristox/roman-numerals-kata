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

  @ParameterizedTest
  @MethodSource("thirtiesValues")
  fun `thirties number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("fortiesValues")
  fun `forties number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("fiftiesValues")
  fun `fifties number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("sixtiesValues")
  fun `sixties number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("seventiesValues")
  fun `seventies number is a roman numeral of`(number: Int, roman: String) {
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

    @JvmStatic
    fun thirtiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(30, "XXX"),
      Arguments.of(31, "XXXI"),
      Arguments.of(32, "XXXII"),
      Arguments.of(33, "XXXIII"),
      Arguments.of(34, "XXXIV"),
      Arguments.of(35, "XXXV"),
      Arguments.of(36, "XXXVI"),
      Arguments.of(37, "XXXVII"),
      Arguments.of(38, "XXXVIII"),
      Arguments.of(39, "XXXIX")
    )

    @JvmStatic
    fun fortiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(40, "XL"),
      Arguments.of(41, "XLI"),
      Arguments.of(42, "XLII"),
      Arguments.of(43, "XLIII"),
      Arguments.of(44, "XLIV"),
      Arguments.of(45, "XLV"),
      Arguments.of(46, "XLVI"),
      Arguments.of(47, "XLVII"),
      Arguments.of(48, "XLVIII"),
      Arguments.of(49, "XLIX")
    )

    @JvmStatic
    fun fiftiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(50, "L"),
      Arguments.of(51, "LI"),
      Arguments.of(52, "LII"),
      Arguments.of(53, "LIII"),
      Arguments.of(54, "LIV"),
      Arguments.of(55, "LV"),
      Arguments.of(56, "LVI"),
      Arguments.of(57, "LVII"),
      Arguments.of(58, "LVIII"),
      Arguments.of(59, "LIX")
    )

    @JvmStatic
    fun sixtiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(60, "LX"),
      Arguments.of(61, "LXI"),
      Arguments.of(62, "LXII"),
      Arguments.of(63, "LXIII"),
      Arguments.of(64, "LXIV"),
      Arguments.of(65, "LXV"),
      Arguments.of(66, "LXVI"),
      Arguments.of(67, "LXVII"),
      Arguments.of(68, "LXVIII"),
      Arguments.of(69, "LXIX")
    )

    @JvmStatic
    fun seventiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(70, "LXX"),
      Arguments.of(71, "LXXI"),
      Arguments.of(72, "LXXII"),
      Arguments.of(73, "LXXIII"),
      Arguments.of(74, "LXXIV"),
      Arguments.of(75, "LXXV"),
      Arguments.of(76, "LXXVI"),
      Arguments.of(77, "LXXVII"),
      Arguments.of(78, "LXXVIII"),
      Arguments.of(79, "LXXIX")
    )
  }
}

