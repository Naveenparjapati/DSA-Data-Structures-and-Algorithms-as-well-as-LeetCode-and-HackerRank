public class rotateright {
    public static void main(String[] args)
    {  //rotate array right with n times
        int[] arr={1,2,3,4,5};//4,5,1,2,3
        int n=7;
        n=n%arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(i<n)
            {
                System.out.print(arr[arr.length+i-n]+" ");
            }else {
                System.out.print(arr[i-n]+" ");
            }
        }
    }
}
