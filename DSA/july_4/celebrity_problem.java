import java.util.Stack;

public class celebrity_problem {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all people to the stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Find potential celebrity
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            // If a knows b, then a can't be celebrity, push b
            if (mat[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        // If no potential candidate
        if (stack.isEmpty())
            return -1;

        int candidate = stack.pop();

        // Step 3: Validate the candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // candidate must not know i, and i must know candidate
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                    return -1;
                }
            }
        }

        return candidate;
    }

}
