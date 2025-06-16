package task1;
public class subarraysum {
    public static void findSubarrays(int[] arr, int target)
    {
        for (int start = 0; start < arr.length; start++)
        {
            int sum = 0;
            for (int end = start; end < arr.length; end++)
            {
                sum += arr[end];
                if (sum == target)
                {
                    System.out.println("Subarray found: [" + start + ", " + end + "]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 2, 1, -2, 5};
        int target = 6;
        findSubarrays(arr, target);
    }
}



//ctrl \    will help you





