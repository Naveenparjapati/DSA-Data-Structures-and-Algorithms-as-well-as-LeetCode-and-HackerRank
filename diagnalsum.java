public class diagnalsum {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{1, 2, 3}, {4, 8, 6}, {7, 8, 9}};
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                if(i+j==2 || i==j)
//                {
//                   sum+=arr[i][j];
//                }
//            }
//            System.out.print(" ");
//        }
//        System.out.print(" "+ sum);
//    }

        for (int i = 0; i < arr.length; i++)
        {
           sum=sum+arr[i][arr.length-1-i];
        }
        System.out.print(sum);
    }
}
