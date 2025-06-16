package backtracking;
public class reverceArray {

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            System.out.println("before" + java.util.Arrays.toString(array));
            reve(array);
            System.out.println("after " + java.util.Arrays.toString(array));
        }

        public static void reve(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
    }

