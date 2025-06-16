package sorting;

class selectionsort{
    public static void selectsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minpos=i;
            for (int j =i+1; j < arr.length-1; j++) {
                // Change the condition to sort in ascending order
                if(arr[minpos] > arr[j]) {
                    minpos=j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
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
        selectsort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }
}