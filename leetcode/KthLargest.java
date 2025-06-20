package leetcode;


import java.util.Arrays;

    public class KthLargest {

        public static void KthLarge(int[] arr, int K) {
            // Sort the array in ascending order
            Arrays.sort(arr);

            // Check if K is valid
            if (K > 0 && K <= arr.length) {
                // Access the Kth largest element
                System.out.println("Kth largest: " + arr[arr.length - K]);
            } else {
                System.out.println("Invalid value for K");
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 2, 7, 10, 66};

            // Find the 3rd largest element
            KthLarge(arr, 4);
        }
    }

