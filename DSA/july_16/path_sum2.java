import java.util.ArrayList;
import java.util.List;

public class path_sum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(root, targetSum, list, new ArrayList<>());
        return list;
    }

    public void dfs(TreeNode root, int targetSum, List<List<Integer>> list, List<Integer> sublist) {
        if (root == null)
            return;
        sublist.add(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            list.add(new ArrayList<>(sublist));
        } else {
            dfs(root.left, targetSum, list, sublist);
            dfs(root.right, targetSum, list, sublist);
        }
        sublist.remove(sublist.size() - 1);
    }
}