package sorting;

 class Bubblesort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Change the condition to sort in ascending order
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // For a new line after printing the array
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 5};
        // Call the bubble sort method
        bubbleSort(arr);
        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }
}