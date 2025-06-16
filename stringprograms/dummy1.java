
package stringprograms;
import java.util.Scanner;
public class dummy1 {
    public static int bserch(int[] arr,int target)
    {
        int start=0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid=start*(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
               return mid;
            }
        }
          return -1;
    }
    public static void main(String[] args)
    {
        //arrays element should be in the asending or desending order
       int[] arr={1,4,6,8,9,20};
       int target=45;
      int result= bserch(arr,target);
      System.out.println(result);
    }
}
