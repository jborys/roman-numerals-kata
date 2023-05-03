import java.util.Arrays;
import java.util.List;

public class RomanNumeralConversion {

    record Conversion(int arabicDigit,
                      String romanDigit){}
    List<Conversion> conversions = Arrays.asList(
            new Conversion(10,"X"),
            new Conversion(5,"V")
    );
    public String convert(int in_arabic) {
        StringBuilder roman = new StringBuilder();
        for (Conversion conversion : conversions) {
            while (in_arabic >= conversion.arabicDigit) {
                roman.append(conversion.romanDigit);
                in_arabic -= conversion.arabicDigit;
            }
        }
        roman.append("I".repeat(in_arabic));
        return roman.toString();
    }
}
