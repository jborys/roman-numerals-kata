public class RomanNumeralConversion {
    public static String convert(int in_arabic) {
        String roman = "";
        while (in_arabic-- >=1) {
            roman += "I";
        }
        return roman;
    }
}
