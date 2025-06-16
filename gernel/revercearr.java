package gernel;
import java.util.Arrays;
public class revercearr {
    static void palindrom(int[] arr)
    {
        int si=0;
        int ei=arr.length-1;
        while(si<ei)
        {
            if(arr[si]!=arr[ei])
            {
                int temp=arr[si];
                arr[si]=arr[ei];
                arr[ei]=temp;
            }
            si++;
            ei--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,22,8};
        palindrom(arr);
    }
}
