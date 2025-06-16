package DSATASK;

public class task1 {
    public static int findmn(int[] arr, int n)
    {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr)
        {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 4, 5, 6};
        int n = 6;
        System.out.println("The missing number is: " + findmn(arr, n));
    }
}
