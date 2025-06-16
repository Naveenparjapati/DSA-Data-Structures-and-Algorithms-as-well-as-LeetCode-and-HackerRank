import java.util.Arrays;

public class rotatearraybrutforceapproach {
    public static void rotate(int[] nums,int k)
    {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=n-k;i<n;i++)
        {
            ans[i-(n-k)]=nums[i];
        }
        for(int i=k;i<n;i++)
        {
            ans[i]=nums[i-k];
        }
        for(int i=0;i<n;i++)
        {
            nums[i] =ans[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int k = 3; // Number of positions to rotate

        rotate(nums, k); // Call the rotate method

        // Print the rotated array
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
