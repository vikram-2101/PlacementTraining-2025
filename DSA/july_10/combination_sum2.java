package DSA.july_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, list, sublist, target, 0);
        return list;
    }

    public void solve(int[] candidates, List<List<Integer>> list, List<Integer> sublist, int target, int index) {
        if (target == 0) {
            list.add(new ArrayList<>(sublist));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            if (candidates[i] > target)
                break;
            sublist.add(candidates[i]);
            solve(candidates, list, sublist, target - candidates[i], i + 1);
            sublist.remove(sublist.size() - 1);
        }
    }
}
