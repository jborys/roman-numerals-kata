import java.util.Arrays;
import java.util.List;

public class RomanNumeralConversion {

    record Conversion(int arabicDigit,
                      String romanDigit){}
    List<Conversion> conversions = Arrays.asList(
            new Conversion(1000,"M"),
            new Conversion(900,"CM"),
            new Conversion(500,"D"),
            new Conversion(400,"CD"),
            new Conversion(100,"C"),
            new Conversion(90,"XC"),
            new Conversion(50,"L"),
            new Conversion(40,"XL"),
            new Conversion(10,"X"),
            new Conversion(9,"IX"),
            new Conversion(5,"V"),
            new Conversion(4,"IV"),
            new Conversion(1,"I")
    );
    public String convert(int in_arabic) {
        StringBuilder roman = new StringBuilder();
        for (Conversion conversion : conversions) {
            while (in_arabic >= conversion.arabicDigit) {
                roman.append(conversion.romanDigit);
                in_arabic -= conversion.arabicDigit;
            }
        }
        return roman.toString();
    }
}
