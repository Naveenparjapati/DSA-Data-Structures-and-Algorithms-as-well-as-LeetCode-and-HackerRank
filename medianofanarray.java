import java.util.Arrays;

public class medianofanarray {
        public static double calculateMedian(int[] numbers) {
            // Sort the array
            Arrays.sort(numbers);

            int length = numbers.length;
            if (length % 2 == 0) {
                //1,2,3,5,7,8
                // If even, return the average of the two middle elements
                return (numbers[length / 2 - 1] + numbers[length / 2]) / 2.0;
            } else {
                // If odd, return the middle element
                return numbers[length / 2];
            }
        }

        public static void main(String[] args) {
            int[] numbers = {5, 3, 8, 1, 2, 7,4};
            double median = calculateMedian(numbers);
            System.out.println("The median is: " + median);
        }
    }

