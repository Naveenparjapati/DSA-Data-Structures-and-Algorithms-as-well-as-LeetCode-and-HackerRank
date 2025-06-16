package searching;
import java.util.Scanner;
public class TWOSUMsortedarray {
        public static int[] twoSum(int[] numbers, int target) {
            int s = 0; // Start pointer
            int e = numbers.length - 1; // End pointer

            while (s < e) {
                if( numbers[s] + numbers[e]>target)
                {
                    e--;
                }
                else if( numbers[s] + numbers[e]<target)
                {
                    s++;
                }
                else{
                    return new int[] {s+1,e+1};
                }

            }
            return new int[] {-1,-1};

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Example input
            int[] numbers = {2, 7, 11, 15};
            int target = 9;

            // Find two sum
            int[] result = twoSum(numbers, target);

            if (result.length == 0) {
                System.out.println("No two sum solution found.");
            } else {
                System.out.println("Indices: " + result[0] + ", " + result[1]);
            }

            scanner.close();
        }
    }


