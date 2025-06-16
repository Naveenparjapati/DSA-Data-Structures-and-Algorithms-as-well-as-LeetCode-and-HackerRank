package ThinkNextType;
import java.util.Arrays;

public class array2101010102020 {
    public static int[] tenrun(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]%10==0 && arr[i+1]%10!=0)
            {
                arr[i+1]=arr[i];
            }
            else if(arr[i]%10==0 && arr[i+1]%10==0)
            {
             arr[i]=arr[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {2,3, 10, 3, 4, 20, 7,20};
               arr =tenrun(arr);
        System.out.print(Arrays.toString(arr));
    }

}
