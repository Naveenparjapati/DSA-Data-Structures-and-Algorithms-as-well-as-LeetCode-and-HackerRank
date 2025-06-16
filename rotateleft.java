public class rotateleft {
    public static void main(String[] args) {
        // Rotate array left with n times
        int[] arr = {1, 2, 3, 4, 5};
        int n = 7;
        n = n % arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - n) {
                System.out.print(arr[i + n] + " ");
            } else {
                System.out.print(arr[i - (arr.length - n)] + " ");
            }
        }
    }
}