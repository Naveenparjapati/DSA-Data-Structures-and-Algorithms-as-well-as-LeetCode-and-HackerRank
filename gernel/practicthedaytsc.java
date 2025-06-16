package gernel;

public class practicthedaytsc {
    public static  void main(String[] args)
    {
        int[] arr={2,4,7,1,6,3};//7776
        //int k=3;
        int max=0;
        for(int i=0;i< arr.length-2;i++)
        {
               max=Math.max(arr[i],arr[i+1]);
               max=Math.max(arr[i+2],max);

            System.out.println("Max of " + arr[i] + ", " + arr[i+1] + ", " + arr[i+2] + " = " + max);
           System.out.println(max);
        }
    }
}
