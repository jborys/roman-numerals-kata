import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanNumeralConversionTest {
    RomanNumeralConversion conversion = new RomanNumeralConversion();

    @ParameterizedTest
    @CsvSource({
            "1, I", "2, II", "3, III", "4, IV",
            "5, V", "7, VII", "9, IX", "10, X",
            "12, XII", "17, XVII", "27, XXVII",
            "30, XXX",
            "40, XL",
            "50, L",
            "90, XC",
            "100, C",
            "400, CD",
            "500, D",
            "900, CM",
            "999, CMXCIX",
            "1000, M",
            "3497, MMMCDXCVII",
            "2944, MMCMXLIV"
    })
    void returnsRomanNumeralsWhenGiveArabicNumbers(int in_arabic, String expected) {
        assertThat(conversion.convert(in_arabic)).isEqualTo(expected);
    }

}
