package DSA.july_7;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    List<List<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> ls = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        cum(candidates, target, 0);
        return ans;
    }

    public void cum(int[] c, int target, int start) {
        if (target == 0) {
            ans.add(new ArrayList<>(ls));
            return;
        }

        for (int i = start; i < c.length; i++) {
            if (c[i] <= target) {
                ls.add(c[i]);
                cum(c, target - c[i], i);
                ls.remove(ls.size() - 1);
            }
        }
    }
}
