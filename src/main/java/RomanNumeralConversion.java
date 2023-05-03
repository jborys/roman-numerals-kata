import java.util.Arrays;
import java.util.List;

public class RomanNumeralConversion {

    record Conversion(int arabicDigit,
                      String romanDigit){};
    List<Conversion> conversions = Arrays.asList(
            new Conversion(10,"X"),
            new Conversion(5,"V")
    );
    public String convert(int in_arabic) {
        String roman = "";
        for (Conversion conversion : conversions) {
            if (in_arabic >= conversion.arabicDigit) {
                roman += conversion.romanDigit;
                in_arabic -= conversion.arabicDigit;
            }
        }
        roman += "I".repeat(in_arabic);
        return roman;
    }
}
