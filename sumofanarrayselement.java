import java.util.Arrays;

public class sumofanarrayselement {
    public static void main(String[] args)
    {

        int[] arr={3,5,1,2,7,9,12};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
