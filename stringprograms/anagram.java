package stringprograms;
import java.util.Scanner;
public class anagram {
    static boolean isAngram(String a,String b)
    {
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean result=false;
        //if length are diffrent
        if(a.length()!=b.length())
        {
            return false;
        }
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        int[] arr=new int[123];
        for(char ch:arr1)
        {
            arr[ch]++;
        }
        for(char ch:arr2)
        {
            arr[ch]--;
        }
        for(int no:arr)
        {
            if(no!=0)
            {
                result=false;
                break;
            }else{
                result=true;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
         boolean ret=isAngram(a,b);
         if(ret) {
             System.out.println("anagram");
         }
         else{
             System.out.println("not abagram");
         }
    }
}
