package DSA.july_3;

import java.util.ArrayList;
import java.util.Stack;

public class stock_span {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> stack = new Stack<>(); // Stores indices

        for (int i = 0; i < arr.length; i++) {
            // Pop elements from stack while current price is greater or equal
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            int spanValue = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            span.add(spanValue);
            stack.push(i); // Push current index
        }

        return span;
    }
}
