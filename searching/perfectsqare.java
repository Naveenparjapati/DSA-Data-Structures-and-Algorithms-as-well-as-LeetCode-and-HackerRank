package searching;
import java.util.Scanner;

public class perfectsqare {
        public static boolean isPerfectSquare(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }

            // Handle the case for 0 and 1
            if (number == 0 || number == 1) {
                return true; // 0 and 1 are perfect squares
            }

            // Start checking from 1 up to the number
            for (int i = 1; i <= number; i++) {
                if (i * i == number) {
                    return true; // Found a perfect square
                }
                if (i * i > number) {
                    return false; // No perfect square found
                }
            }

            return false; // This line should never be reached
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a non-negative integer: ");
            int number = scanner.nextInt();

            // Check if the number is a perfect square
            boolean isPerfect = isPerfectSquare(number);

            if (isPerfect) {
                System.out.println(number + " is a perfect square.");
            } else {
                System.out.println(number + " is not a perfect square.");
            }

            scanner.close();
        }
    }

