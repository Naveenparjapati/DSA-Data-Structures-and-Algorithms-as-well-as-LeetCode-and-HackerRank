package leetcode;

import java.util.HashMap;
public class ContainsDuplicatesecond219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap to store the most recent index of each number
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current number has been seen before
            if (indexMap.containsKey(nums[i])) {
                // Check the distance between the current index and the last index of the same number
                if (i - indexMap.get(nums[i]) <= k) {
                    return true; // Found a pair of indices satisfying the condition
                }
            }
            // Update the index of the current number
            indexMap.put(nums[i], i);
        }

        // Return false if no such pair is found
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicatesecond219 solution = new ContainsDuplicatesecond219();

        // Test cases
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); // Output: true
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)); // Output: true
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // Output: false
    }
}
