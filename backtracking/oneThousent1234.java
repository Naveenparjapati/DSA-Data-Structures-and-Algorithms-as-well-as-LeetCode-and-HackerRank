package backtracking;
import java.util.Scanner;
public class oneThousent1234 {
        private static final String[] units = {
                "", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };
        private static final String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"
        };

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("zero");
            } else {
                String result = convertToWords(number);
                System.out.println("Output: " + result);
            }
        }

        public static String convertToWords(int number) {
            if (number < 0) {
                return "minus " + convertToWords(-number);
            }

            if (number < 20) {
                return units[number];
            }

            if (number < 100) {
                return tens[number / 10] + (number % 10 != 0 ? " " + convertToWords(number % 10) : "");
            }

            if (number < 1000) {
                return units[number / 100] + " hundred" + (number % 100 != 0 ? " and " + convertToWords(number % 100) : "");
            }

            if (number < 1000000) {
                return convertToWords(number / 1000) + " thousand" + (number % 1000 != 0 ? " " + convertToWords(number % 1000) : "");
            }

            if (number < 1000000000) {
                return convertToWords(number / 1000000) + " million" + (number % 1000000 != 0 ? " " + convertToWords(number % 1000000) : "");
            }

            return convertToWords(number / 1000000000) + " billion" + (number % 1000000000 != 0 ? " " + convertToWords(number % 1000000000) : "");
        }
    }

