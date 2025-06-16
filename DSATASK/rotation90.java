package DSATASK;
public class rotation90 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int r=0;r<matrix.length;r++)
        {
            for(int c=matrix.length-1;c>=0;c--)
            {
                System.out.print(matrix[c][r]+" ");
            }
            System.out.println();
        }


    }
}