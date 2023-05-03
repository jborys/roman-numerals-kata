

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanNumeralConversionTest {
    @Test
    void returnsRomanNumeral_I_WhenGiven_1() {
        assertThat(RomanNumeralConversion.convert(1))
                .isEqualTo("I");
    }
}
