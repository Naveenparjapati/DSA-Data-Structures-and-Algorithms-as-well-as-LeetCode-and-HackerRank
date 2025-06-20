package leetcode;

import java.util.Arrays;

public class KthSmallest {
    public static void KthSmal(int[] arr, int K) {
        // Sort the array to get elements in ascending order
        Arrays.sort(arr);
        // Check if K is valid
        if (K > 0 && K <= arr.length) {
            System.out.println("Kth smallest: " + arr[K - 1]);
        } else {
            System.out.println("Invalid value for K");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 10, 66};

        // Find the 3rd smallest element
        KthSmal(arr, 3);
    }
}