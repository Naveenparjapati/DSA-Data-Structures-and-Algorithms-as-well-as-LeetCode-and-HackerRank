package searching;
import java.util.*;
public class sqareofnumber {

        public static int calculateSquareRoot(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }

            // Handle the case for 0 and 1
            if (number == 0 || number == 1) {
                return number;
            }

            // Start checking from 1 up to the number
            for (int i = 1; i <= number; i++) {
                if (i * i == number) {
                    return i; // Perfect square
                }
                if (i * i > number) {
                    return i - 1; // Return the largest integer whose square is less than the number
                }
            }

            return -1; // This line should never be reached
        }

        public static void main(String[] args) {


            // Calculate square root using the brute-force method
            int squareRoot = calculateSquareRoot(5);

            System.out.println( squareRoot);


        }
    }

