package sorting;

public class insertionsort {
    public static void insertsort(int[] arr)
    {
        for(int i=1;i< arr.length;i++)
        {
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
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
        insertsort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
