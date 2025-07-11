package DSA.july_9;

import java.util.Arrays;

public class house_robber2 {
    public int rob(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        Arrays.fill(dp2, -1);
        Arrays.fill(dp1, -1);
        return Math.max(solve(nums, 0, n - 1, dp1), solve(nums, 1, n, dp2));
    }

    public int solve(int[] nums, int i, int n, int[] dp) {
        if (i >= n)
            return 0;
        if (dp[i] != -1)
            return dp[i];

        int take = nums[i] + solve(nums, i + 2, n, dp);
        int skip = solve(nums, i + 1, n, dp);

        return dp[i] = Math.max(take, skip);
    }
}
