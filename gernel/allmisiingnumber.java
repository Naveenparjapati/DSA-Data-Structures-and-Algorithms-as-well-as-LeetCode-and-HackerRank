package gernel;

import java.util.ArrayList;

public class allmisiingnumber {
    public static void main(String[] args)
    {
        //note if array is not sorted first sort the array
        int[] arr={1,3,5,7,9};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:arr)
        {
            a.add(i);
        }
        for(int i=arr[0];i<arr[arr.length-1];i++)
        {
            if(!a.contains(i))
            {
                a.add(i);
            }
        }

        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
