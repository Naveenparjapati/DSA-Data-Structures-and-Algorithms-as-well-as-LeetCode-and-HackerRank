package gernel;

public class questi1213524242 {
    public static void main(String[] args)
    {
        int[] arr={1,2,1,3,5,2,4,2,4,2};//4
        int c=0,j=2;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(j<=arr.length-1)
            {
                if (arr[i]+arr[j]== arr[j-1])
                {
                    c++;
                }
                j++;
            }
        }
        System.out.print(c);

    }
}
