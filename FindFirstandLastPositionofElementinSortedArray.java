import java.util.Arrays;

 class FindFirstAndLastPositionOfElementInSortedArray {
    public static void findFirstAndLast(int[] arr, int target) {
        int[] ansArray = new int[2];
        ansArray[0] = ansArray[1] = -1;

        // Find the first occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ansArray[0] = i; // First occurrence
                break; // Exit the loop after finding the first occurrence
            }
        }

        // If the target was not found, return
        if (ansArray[0] == -1) {
            System.out.println(Arrays.toString(ansArray));
            return;
        }

        // Find the last occurrence
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                ansArray[1] = i; // Last occurrence
                break; // Exit the loop after finding the last occurrence
            }
        }

        System.out.println(Arrays.toString(ansArray));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4}; // Sorted array
        int target = 4;
        findFirstAndLast(arr, target);
    }
}