package backtracking;
import java.util.Scanner;

public class numbertoLetter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number between 1 and 26: ");
            int number = scanner.nextInt();

            // Check if number is within the valid range
            if (number < 1 || number > 26) {
                System.out.println("Invalid number. Please enter a number between 1 and 26.");
            } else {
                char letter = convertToLetter(number);
                System.out.println("Corresponding letter is: " + letter);
            }
        }

        // Function to convert a number to its corresponding letter
        public static char convertToLetter(int number) {
            return (char) ('A' + number - 1);
        }
    }

