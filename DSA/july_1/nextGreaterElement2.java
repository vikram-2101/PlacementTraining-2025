package DSA.july_1;

import java.util.*;

public class nextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int current = nums[i % n];
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            if (i < n && !stack.isEmpty()) {
                arr[i] = stack.peek();
            }

            stack.push(current);
        }

        return arr;
    }

    public static void main(String[] args) {
        nextGreaterElement2 sol = new nextGreaterElement2();
        int[] nums = { 1, 2, 1 };
        int[] result = sol.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
