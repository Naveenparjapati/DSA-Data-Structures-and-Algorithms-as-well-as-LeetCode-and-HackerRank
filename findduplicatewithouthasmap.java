import java.util.Arrays;

public class findduplicatewithouthasmap {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4,4,2, 3, 6,6, 6};//2 3
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i +1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println("Value: " + arr[i - 1] + ", Count: " + count);
                }
                count = 1;
            }

        }
        // Check for the last element
        if (count > 1) {
            System.out.println("Value: " + arr[arr.length - 1] + ", Count: " + count);
        }
    }
}
