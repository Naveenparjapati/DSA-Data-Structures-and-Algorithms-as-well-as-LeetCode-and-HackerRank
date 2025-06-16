package searching;
import java.util.Arrays;
public class firstandlastindex {

        public static int[] binarySearch(int[] arr, int target)
        {
            int[] arrAns = {-1, -1}; // Array to hold first and last occurrences
            // Check for first occurrence
            arrAns[0] = search(arr, target, true);
            // Check for last occurrence
            arrAns[1] = search(arr, target, false);
            return arrAns;
        }

        // This function returns the index value of a target
        public static int search(int[] arr, int target, boolean findStartIndex)
        {
            int ans = -1; // Variable to store the answer
            int start = 0;
            int end = arr.length - 1;

            // Check for the first occurrence if target is found
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // Potential answer is found
                    ans = mid; // Update the answer
                    if (findStartIndex) {
                        end = mid - 1; // Move left to find the first occurrence
                    } else {
                        start = mid + 1; // Move right to find the last occurrence
                    }
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 5, 7, 7, 8, 10};
            int target = 7;
            int[] result = binarySearch(arr, target);
            System.out.println("Target found at indices: " + Arrays.toString(result));
        }
    }

