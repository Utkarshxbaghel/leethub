import java.util.*;

class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();
                int score = (v == 0) ? 1 : 2 * v;

                int top = stack.pop();
                stack.push(top + score);
            }
        }

        return stack.pop();
    }
}