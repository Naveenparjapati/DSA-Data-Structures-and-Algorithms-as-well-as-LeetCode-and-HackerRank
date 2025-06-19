package leetcode;

import java.util.Stack;

class ValidParenthesis {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') { // FIX: Changed the last '|| ch == "{"' to '|| ch == "["'
                s.push(ch);
            } else {
                // Closing brackets
                if (s.isEmpty()) {
                    return false;
                }

                if ((s.peek() == '(' && ch == ')') ||
                        (s.peek() == '{' && ch == '}') ||
                        (s.peek() == '[' && ch == ']')) {
                    s.pop(); //  s.pop() for valid scenarios so stack gets updated
                } else {
                    return false;
                }
            }
        }


        if( s.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
//        String str = "[](){}";
        String str = "({})[]";
        System.out.println(isValid(str)); // Will print `true` for valid parentheses
    }
}