package DSA.july_11;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
    List<List<String>> res = new ArrayList<>();
    boolean[][] dp;

    public List<List<String>> partition(String s) {
        int n = s.length();
        List<String> path = new ArrayList<>();
        dp = new boolean[n][n];
        isPalindrome(s);
        helper(s, 0, path);
        return res;
    }

    private void helper(String s, int index, List<String> path) {
        if (index >= s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (dp[index][i]) {
                path.add(s.substring(index, i + 1));
            } else
                continue;
            helper(s, i + 1, path);
            path.removeLast();
        }

    }

    private void isPalindrome(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (chars[i] == chars[j]) {
                    if (j - i <= 1)
                        dp[i][j] = true;
                    else if (dp[i + 1][j - 1])
                        dp[i][j] = true;
                }
            }
        }
    }
}
