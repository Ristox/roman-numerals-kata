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

  @Test
  fun `too large value (over 5999) is not supported`() {
    val test: () -> Unit = { RomanNumber(6000) }

    assertFailsWith<IllegalArgumentException>(
      "Value of 6000 is not supported (maximum is 5999)",
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

  @ParameterizedTest
  @MethodSource("eightiesValues")
  fun `eighties number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("ninetiesValues")
  fun `nineties number is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("valuesInTheOneHundreds")
  fun `number in 100-s is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("valuesInTheTwoHundreds")
  fun `number in 200-s is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("valuesInTheThreeHundreds")
  fun `number in 300-s is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("valuesInTheFourHundreds")
  fun `number in 400-s is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("valuesBetweenFiveHundredsAndEightHundreds")
  fun `number between 500-s and 800-s is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("valuesInTheNineHundreds")
  fun `number in 900-s is a roman numeral of`(number: Int, roman: String) {
    number.assertIsRomanNumeral(roman)
  }

  @ParameterizedTest
  @MethodSource("valuesInTheThousands")
  fun `number in 1000-s is a roman numeral of`(number: Int, roman: String) {
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

    @JvmStatic
    fun eightiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(80, "LXXX"),
      Arguments.of(81, "LXXXI"),
      Arguments.of(82, "LXXXII"),
      Arguments.of(83, "LXXXIII"),
      Arguments.of(84, "LXXXIV"),
      Arguments.of(85, "LXXXV"),
      Arguments.of(86, "LXXXVI"),
      Arguments.of(87, "LXXXVII"),
      Arguments.of(88, "LXXXVIII"),
      Arguments.of(89, "LXXXIX")
    )

    @JvmStatic
    fun ninetiesValues(): Stream<Arguments> = Stream.of(
      Arguments.of(90, "XC"),
      Arguments.of(91, "XCI"),
      Arguments.of(92, "XCII"),
      Arguments.of(93, "XCIII"),
      Arguments.of(94, "XCIV"),
      Arguments.of(95, "XCV"),
      Arguments.of(96, "XCVI"),
      Arguments.of(97, "XCVII"),
      Arguments.of(98, "XCVIII"),
      Arguments.of(99, "XCIX")
    )

    @JvmStatic
    fun valuesInTheOneHundreds(): Stream<Arguments> = Stream.of(
      Arguments.of(100, "C"),
      Arguments.of(101, "CI"),
      Arguments.of(102, "CII"),
      Arguments.of(104, "CIV"),
      Arguments.of(107, "CVII"),
      Arguments.of(109, "CIX"),
      Arguments.of(110, "CX"),
      Arguments.of(119, "CXIX"),
      Arguments.of(123, "CXXIII"),
      Arguments.of(138, "CXXXVIII"),
      Arguments.of(149, "CXLIX"),
      Arguments.of(150, "CL"),
      Arguments.of(177, "CLXXVII"),
      Arguments.of(183, "CLXXXIII"),
      Arguments.of(185, "CLXXXV"),
      Arguments.of(188, "CLXXXVIII"),
      Arguments.of(191, "CXCI"),
      Arguments.of(193, "CXCIII"),
      Arguments.of(196, "CXCVI"),
      Arguments.of(199, "CXCIX"),
    )

    @JvmStatic
    fun valuesInTheTwoHundreds(): Stream<Arguments> = Stream.of(
      Arguments.of(200, "CC"),
      Arguments.of(201, "CCI"),
      Arguments.of(209, "CCIX"),
      Arguments.of(217, "CCXVII"),
      Arguments.of(238, "CCXXXVIII"),
      Arguments.of(249, "CCXLIX"),
      Arguments.of(250, "CCL"),
      Arguments.of(277, "CCLXXVII"),
      Arguments.of(283, "CCLXXXIII"),
      Arguments.of(285, "CCLXXXV"),
      Arguments.of(288, "CCLXXXVIII"),
      Arguments.of(291, "CCXCI"),
      Arguments.of(293, "CCXCIII"),
      Arguments.of(296, "CCXCVI"),
      Arguments.of(299, "CCXCIX"),
    )

    @JvmStatic
    fun valuesInTheThreeHundreds(): Stream<Arguments> = Stream.of(
      Arguments.of(300, "CCC"),
      Arguments.of(301, "CCCI"),
      Arguments.of(309, "CCCIX"),
      Arguments.of(317, "CCCXVII"),
      Arguments.of(338, "CCCXXXVIII"),
      Arguments.of(349, "CCCXLIX"),
      Arguments.of(350, "CCCL"),
      Arguments.of(377, "CCCLXXVII"),
      Arguments.of(383, "CCCLXXXIII"),
      Arguments.of(385, "CCCLXXXV"),
      Arguments.of(388, "CCCLXXXVIII"),
      Arguments.of(391, "CCCXCI"),
      Arguments.of(393, "CCCXCIII"),
      Arguments.of(396, "CCCXCVI"),
      Arguments.of(399, "CCCXCIX"),
    )

    @JvmStatic
    fun valuesInTheFourHundreds(): Stream<Arguments> = Stream.of(
      Arguments.of(400, "CD"),
      Arguments.of(410, "CDX"),
      Arguments.of(444, "CDXLIV"),
      Arguments.of(450, "CDL"),
      Arguments.of(478, "CDLXXVIII"),
      Arguments.of(490, "CDXC"),
      Arguments.of(493, "CDXCIII"),
      Arguments.of(495, "CDXCV"),
      Arguments.of(499, "CDXCIX"),
    )

    @JvmStatic
    fun valuesBetweenFiveHundredsAndEightHundreds(): Stream<Arguments> = Stream.of(
      Arguments.of(501, "DI"),
      Arguments.of(555, "DLV"),
      Arguments.of(599, "DXCIX"),
      Arguments.of(600, "DC"),
      Arguments.of(649, "DCXLIX"),
      Arguments.of(688, "DCLXXXVIII"),
      Arguments.of(777, "DCCLXXVII"),
      Arguments.of(800, "DCCC"),
      Arguments.of(842, "DCCCXLII"),
      Arguments.of(888, "DCCCLXXXVIII"),
      Arguments.of(899, "DCCCXCIX"),
    )

    @JvmStatic
    fun valuesInTheNineHundreds(): Stream<Arguments> = Stream.of(
      Arguments.of(900, "CM"),
      Arguments.of(901, "CMI"),
      Arguments.of(942, "CMXLII"),
      Arguments.of(949, "CMXLIX"),
      Arguments.of(974, "CMLXXIV"),
      Arguments.of(988, "CMLXXXVIII"),
      Arguments.of(999, "CMXCIX"),
    )

    @JvmStatic
    fun valuesInTheThousands(): Stream<Arguments> = Stream.of(
      Arguments.of(1111, "MCXI"),
      Arguments.of(1548, "MDXLVIII"),
      Arguments.of(1549, "MDXLIX"),
      Arguments.of(1687, "MDCLXXXVII"),
      Arguments.of(1699, "MDCXCIX"),
      Arguments.of(2500, "MMD"),
      Arguments.of(2489, "MMCDLXXXIX"),
      Arguments.of(3888, "MMMDCCCLXXXVIII"),
      Arguments.of(3979, "MMMCMLXXIX"),
      Arguments.of(2990, "MMCMXC"),
      Arguments.of(2999, "MMCMXCIX"),
      Arguments.of(4999, "MMMMCMXCIX"),
      Arguments.of(5999, "MMMMMCMXCIX"),
      Arguments.of(3949, "MMMCMXLIX"),
    )
  }
}

