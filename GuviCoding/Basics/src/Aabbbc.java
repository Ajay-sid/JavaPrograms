public class Aabbbc {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0) {
            return "Minus " + convertNumberToWords(-number);
        }

        String words = convertToWords(number);
        return words;
    }

    private static String convertToWords(int number) {
        String words = "";

        if (number > 0) {
            if (number < 10) {
                words += units[number];
            } else if (number < 20) {
                words += teens[number % 10];
            } else {
                int tensDigit = number / 10;
                int unitsDigit = number % 10;
                words += tens[tensDigit] + " " + units[unitsDigit];
            }
        }

        return words.trim();
    }

    public static void main(String[] args) {
        int number1 = 55;
        int number2 = 19;

        String words1 = convertNumberToWords(number1);
        String words2 = convertNumberToWords(number2);

        System.out.println(number1 + " in words: " + words1);
        System.out.println(number2 + " in words: " + words2);
    }
}
