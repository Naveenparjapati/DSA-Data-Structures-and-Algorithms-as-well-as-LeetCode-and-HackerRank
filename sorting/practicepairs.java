package sorting;

import java.util.Arrays;

 class PracticePairs {
    public static void main(String[] args) {
        // Reverse an array
        int[] arr = {1, 2, 3, 4, 5}; // Expected output: [5, 4, 3, 2, 1]

        int si = 0;
        int ei = arr.length - 1;

        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;

            // Increment start index and decrement end index
            si++;
            ei--;
        }

        System.out.println(Arrays.toString(arr)); // Output: [5, 4, 3, 2, 1]
    }
}
