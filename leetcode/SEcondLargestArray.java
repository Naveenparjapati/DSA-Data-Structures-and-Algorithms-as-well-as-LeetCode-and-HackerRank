package leetcode;

public class SEcondLargestArray {

    public static void secLargest(int[] arr)
    {
        int Frstlarg=Integer.MIN_VALUE;
        int Secondlarg=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>Frstlarg)
            {
                Secondlarg=Frstlarg;
                Frstlarg=arr[i];
            }else if(arr[i]>Secondlarg && arr[i] != Frstlarg)
            {
                Secondlarg=arr[i];
            }
        }

        System.out.println("second largest "+Secondlarg);

    }
    public static void main(String[] args) {
        int[] arr={1,5,2,7,10,66};

        secLargest(arr);

    }
}
