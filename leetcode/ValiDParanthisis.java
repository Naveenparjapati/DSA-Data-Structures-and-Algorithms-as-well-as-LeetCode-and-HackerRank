package leetcode;
import java.util.Stack;

public class ValiDParanthisis {
    public boolean isValid(String s) {
        // Initialize a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            // Check if the character is an opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets onto the stack
            } else {
                // If stack is empty or the top of the stack doesn't match the closing bracket, return false
                if (stack.isEmpty()) return false;

                char top = stack.pop(); // Pop the top of the stack

                // Check for matching opening bracket
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // At the end, if the stack is empty, all brackets were matched properly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValiDParanthisis solution = new ValiDParanthisis();

        // Test cases
        String[] testCases = {
                "()",
                "()[]{}",
                "(]",
                "([])",
                "([{}])",
                "((()))",
                "{[()]}",
                "([)]",
                "((]",
        };

        // Output results for each test case
        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\" | Output: " + solution.isValid(testCase));
        }
    }
}
