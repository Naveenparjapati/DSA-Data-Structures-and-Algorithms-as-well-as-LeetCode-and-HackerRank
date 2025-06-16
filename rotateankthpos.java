
import java.util.Arrays;
 class RotateKthPos {
    // Optimal approach to rotate the array
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than n
        flip(nums, 0, n - 1); // Step 1: Reverse the entire array
        flip(nums, 0, k - 1); // Step 2: Reverse the first k elements
        flip(nums, k, n - 1); // Step 3: Reverse the remaining elements
    }

    // Helper method to reverse a portion of the array
    public static void flip(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int k = 3; // Number of positions to rotate

        rotate(nums, k); // Call the rotate method

        // Print the rotated array
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}