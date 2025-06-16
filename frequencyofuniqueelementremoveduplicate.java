import java.util.Arrays;
public class frequencyofuniqueelementremoveduplicate {

        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            System.out.println("After removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, i + 1)));
            return i+=1;
        }

    public static void main(String[] args)
    {
        //sorted array input allow
        int[] nums = {1,1,4,8,8,12};

        int length =removeDuplicates(nums);
        System.out.println("Length of unique elements: " + length);
// Output: Length of unique elements: 2
    }
}
