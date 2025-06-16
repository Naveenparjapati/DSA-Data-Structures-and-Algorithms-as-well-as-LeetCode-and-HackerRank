import java.util.Arrays;
public class topointerapproachrevercethearay {

        public static void reverseArray(int[] array) {
            int start = 0; // Starting index
            int end = array.length - 1; // Ending index

            // Swap elements until the middle of the array is reached
            while (start < end) {
                // Swap array[start] and array[end]
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                // Move towards the middle
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3,43, 4, 5}; // Example array
            System.out.println("Original array:");
            System.out.println(Arrays.toString(numbers));
            reverseArray(numbers); // Reverse the array
            System.out.println("Reversed array:");
            System.out.println(Arrays.toString(numbers));
        }


        }


