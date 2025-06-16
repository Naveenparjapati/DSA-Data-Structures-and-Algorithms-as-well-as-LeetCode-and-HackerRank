public class selectionsort {


        // Method to perform selection sort
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            // Traverse through all array elements
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in the unsorted array
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j; // Update minIndex if a smaller element is found
                    }
                }

                // Swap the found minimum element with the first element of the unsorted part
                if (minIndex != i) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        // Method to print the array
        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11}; // Example array
            System.out.println("Original array:");
            printArray(arr);

            selectionSort(arr); // Sort the array

            System.out.println("Sorted array:");
            printArray(arr); // Print the sorted array
        }
    }

