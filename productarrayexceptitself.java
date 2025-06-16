import java.util.*;

public class productarrayexceptitself {
    static void prod(int[] arr)
    {
        int[] ans=new int[arr.length];
        //initialize to 1  if i would not initialize to 1 initial valuue 0 if we multiply any value with 0 result 0
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=1;
        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    ans[i]*=arr[j];
                }
            }
        }
        System.out.print(Arrays.toString(ans));
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
         prod(arr);
    }
}
