public class smalest {
//    public static int smallest(int[] arr)
//    { int largest=arr[0];
//        int secondlarg=Integer.MIN_VALUE;
//        for(int i=1;i<arr.length;i++)
//        {
//           if(arr[i]>largest)
//           {
//               secondlarg=largest;
//               largest=arr[i];
//           }
//           else if (arr[i] > secondlarg && arr[i] < largest) {
//               secondlarg = arr[i]; // Update second largest
//           }
//        }
//        return secondlarg;
//    }


    //second smallest
    public static int smallest(int[] arr)
    { int largest=arr[0];
        int secondlarg=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<largest)
            {
                secondlarg=largest;
                largest=arr[i];
            }
            else if (arr[i] < secondlarg && arr[i] !=largest) {
                secondlarg = arr[i]; // Update second largest
            }
        }
        return secondlarg;
    }
    public static void main(String[] ags)
    {
        int[] arr={2,3,1,4,5};
        int result=smallest(arr);
        System.out.println(result);
    }
}
