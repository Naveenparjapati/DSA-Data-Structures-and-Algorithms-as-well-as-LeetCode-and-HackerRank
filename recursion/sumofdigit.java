package recursion;

public class sumofdigit {
        static int sum(int number)
        {
            if(number<=1)
            {
                return 1 ;
            }
            return number+sum(number-1);
        }
        public static void main(String[] args)
        {
            int ans=sum(5);
            System.out.print(ans);
        }

    }


