package gernel;

import java.util.Arrays;

public class practice2 {
    static void proditself(int[] arr)
    {
        //make new arr set 1 value
        int[] ans=new int[arr.length];
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
   proditself(arr);

    }
}
