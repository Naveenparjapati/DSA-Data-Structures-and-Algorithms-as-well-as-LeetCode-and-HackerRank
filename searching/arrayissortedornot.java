package searching;

public class arrayissortedornot {

        public static void main(String[] args) {
            int[] array = {50,60,70,80,90}; // Example array
            boolean isSorted = isArraySorted(array);

            if (isSorted) {
                System.out.println("The array is sorted in ascending order.");
            } else {
                System.out.println("The array is not sorted.");
            }
        }

        public static boolean isArraySorted(int[] array) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false; // Found an element that is greater than the next one
                }
            }
            return true; // No elements were out of order
        }
    }

