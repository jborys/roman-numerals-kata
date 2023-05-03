import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanNumeralConversionTest {
    RomanNumeralConversion conversion = new RomanNumeralConversion();

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "5, V",
            "7, VII",
            "10, X",
            "12, XII",
            "17, XVII",
            "27, XXVII"
    })
    void returnsRomanNumeralsWhenGiveArabicNumbers(int in_arabic, String expected) {
        assertThat(conversion.convert(in_arabic)).isEqualTo(expected);
    }

}
