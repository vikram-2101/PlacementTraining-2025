package DSA.july_7;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();

        solve(nums, output, 0);
        return output;
    }

    public void solve(int[] nums, List<List<Integer>> output, int index) {
        if (index >= nums.length) {
            List<Integer> ans = new ArrayList<>();
            for (int el : nums) {
                ans.add(el);
            }
            output.add(ans);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            solve(nums, output, index + 1);
            // backtrack
            swap(nums, index, i);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
