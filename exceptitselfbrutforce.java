import java.util.Arrays;
 class ExceptItselfBrutForce {
    public static void brutforce(int[] arr) {
        int[] ans = new int[arr.length];
        // Initialize the ans array to 1
        for (int i = 0; i < ans.length; i++) {
            ans[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    ans[i] *= arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        brutforce(arr);
    }
}