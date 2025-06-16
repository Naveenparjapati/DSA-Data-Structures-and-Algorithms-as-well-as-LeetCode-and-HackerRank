package gernel;
import java.util.Arrays;
public class kthelement {
        public static void main(String[] args) {
            int[] arr = {3, 2, 1, 5, 6, 4};
            int k = 3; // Change this value to find the k-th largest element
            int kthLargest = findKthLargest(arr, k);
            if (kthLargest != Integer.MIN_VALUE) {
                System.out.println(k + "th largest element is: " + kthLargest);
            } else {
                System.out.println("There is no " + k + "th largest element.");
            }
        }
        public static int findKthLargest(int[] arr, int k) {
            if (k > arr.length || k <= 0) {
                return Integer.MIN_VALUE; // Invalid k
            }
            // Sort the array in descending order
            Arrays.sort(arr);
            // Return the k-th largest element
            return arr[arr.length - k];
        }
    }

