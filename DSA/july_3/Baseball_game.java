package DSA.july_3;

import java.util.Stack;

public class Baseball_game {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            String str = operations[i];
            if (str.equals("C")) {
                stack.pop();
            } else if (str.equals("D")) {
                int c = stack.pop();
                int ans = 2 * c;
                stack.push(c);
                stack.push(ans);
            } else if (str.equals("+")) {
                int a = stack.pop();

                int b = stack.pop();
                int result = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
