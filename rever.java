
class ReverseStringExample1
{
    public static void main(String args[])
    {
        String s="naveen";

        System.out.print("After reverse string is: ");
        for(int i=s.length();i>0;--i)
        {
            System.out.print(s.charAt(i-1));
        }
    }
}