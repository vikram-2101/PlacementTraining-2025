package DSA.july_9;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return output;
    }

    public void solve(int[] nums, List<List<Integer>> output, int j, List<Integer> anss) {
        if (j >= nums.length) {
            output.add(new ArrayList<>(anss));
            return;
        }

        solve(nums, output, j + 1, anss);
        // int n = nums[j];
        anss.add(nums[j]);
        solve(nums, output, j + 1, anss);
        anss.remove(anss.size() - 1);
    }
}
