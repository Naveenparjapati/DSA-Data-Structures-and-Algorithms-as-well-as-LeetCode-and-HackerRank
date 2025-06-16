package StackAll;

import java.util.Stack;
public class PushAtBottom{
    // Corrected naming convention: camelCase
    public static void pushBottom(Stack<Integer> s, int data) {
        // Recursively push 'data' to the bottom of the stack

        // Base case: If the stack is empty, push 'data' and return
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Recursive step:
        // 1. Pop the top element
        int top = s.pop();

        // 2. Recursively push 'data' to the bottom of the remaining stack
        pushBottom(s, data);

        // 3. Push the previously popped element back onto the stack
        //    This ensures the original order is preserved, with 'data' at the bottom
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        // push at bottom 4 in this stack
        pushBottom(s, 4);

        // Print the stack (LIFO - Last In First Out)
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}