import java.util.Scanner;

public class taskdsa {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of station names:");
        size = sc.nextInt(); // Number of station names

        String[] arr = new String[size];
        System.out.println("Enter the station names:");
        sc.nextLine(); // Consume the newline left by nextInt()

        // Read station names into the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }

        // Sort the array using Quick Sort
        quickSort(arr, 0, size - 1);

        // Output the sorted station names
        System.out.println("Sorted station names:");
        for (String station : arr) {
            System.out.println(station);
        }
    }


    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);  //left side
            quickSort(arr, pivotIndex + 1, high); //right side of array
        }
    }

    // Partition function
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high]; // Select the last element as the pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // Compare strings lexicographically
            if (arr[j].compareToIgnoreCase(pivot) <= 0) {
                i++;
                // Swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (the pivot)
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the index of the pivot
    }
}