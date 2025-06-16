package StackAll;
import java.util.Stack;

public class REverceStringUsingSTack{

    public static String reverceStr(String str) {
        Stack<Character> s = new Stack<>();
        int ind=0;

        while(ind<str.length())
        {
            s.push(str.charAt(ind));
            ind++;
        }
        StringBuilder result=new StringBuilder(" ");
        while(!s.isEmpty())
        {
            // char ch=s.pop()
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str="abc";
        System.out.print(reverceStr(str));
    }
}