import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RomanNumeralConversionTest {
    @Test
    void returnsRomanNumeral_I_WhenGiven_1() {
        assertThat(RomanNumeralConversion.convert(1))
                .isEqualTo("I");
    }
}
