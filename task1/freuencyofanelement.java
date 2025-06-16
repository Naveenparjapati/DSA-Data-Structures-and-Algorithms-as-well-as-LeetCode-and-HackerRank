package task1;
import java.util.Scanner;
public class freuencyofanelement {
    public static void main(String[] args)
    {
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array value");
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int visit=-1;
        int v[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    v[j]=visit;
                }
            }
            if(v[i]!=visit)
            {
                v[i]=count;
            }
        }
        for(int i=0;i<v.length;i++)
        {
            if(v[i]!=visit)
            {
                System.out.println(arr[i]+" "+v[i]);
            }
        }
    }
}
