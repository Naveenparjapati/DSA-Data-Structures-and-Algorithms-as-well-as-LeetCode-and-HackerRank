package leetcode;

public class ThirdLargestArray {
    public static void thirdLargest(int[] arr)
    {
        int Frstlarg=Integer.MIN_VALUE;
        int Secondlarg=Integer.MIN_VALUE;
        int Thirdlarg=Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>Frstlarg)
            {
                Thirdlarg=Secondlarg;
                Secondlarg=Frstlarg;
                Frstlarg=arr[i];
            }else if(arr[i]>Secondlarg && arr[i] != Frstlarg)
            {
                Secondlarg=arr[i];
            }
            else if(arr[i]>Thirdlarg && arr[i] != Secondlarg)
            {
                Thirdlarg=arr[i];
            }
        }

        System.out.println("third largest "+Thirdlarg);

    }


    public static void main(String[] args) {
        int[] arr={1,5,2,7,10,66};
        thirdLargest(arr);;
    }
}
