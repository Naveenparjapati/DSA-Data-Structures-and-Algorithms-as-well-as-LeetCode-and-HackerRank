import java.util.Arrays;
public class practice {
    static int flo(int n)
    {   int sum=0;
        while(n!=0) {
            int rem = n % 10;
            sum = sum + rem*rem;
            n = n / 10;
        }
       return  sum;
    }
    public static void main(String[] args) {

        int n = 144;
        while(n<=9) {
            System.out.print(flo(n));
        }
    }
}