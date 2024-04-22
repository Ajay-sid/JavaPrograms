public class Sec1 {


        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true; // Leap year
                    } else {
                        return false; // Not a leap year
                    }
                } else {
                    return true; // Leap year
                }
            } else {
                return false; // Not a leap year
            }
        }

        public static void main(String[] args) {
            int[] yearsToCheck = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600, 1600, 2000, 2400, 2024};

            for (int year : yearsToCheck) {
                System.out.println(year + " is a leap year? " + isLeapYear(year));
            }
        }












}
