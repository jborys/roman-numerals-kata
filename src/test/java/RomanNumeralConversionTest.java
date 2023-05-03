import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanNumeralConversionTest {

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III"
    })
    void returnsRomanNumeralsWhenGiveArabicNumbers(int in_arabic, String expected) {
        assertThat(RomanNumeralConversion.convert(in_arabic)).isEqualTo(expected);
    }

}
