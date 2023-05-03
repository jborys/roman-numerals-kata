public class RomanNumeralConversion {
    public static String convert(int in_arabic) {
        String roman = "";
        if (in_arabic >= 10) {
            roman += "X";
            in_arabic -= 10;
        }
        if (in_arabic >= 5) {
            roman += "V";
            in_arabic -= 5;
        }
        roman += "I".repeat(in_arabic);
        return roman;
    }
}
