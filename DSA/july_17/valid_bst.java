import java.util.ArrayList;
import java.util.List;

public class valid_bst {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = sol(root);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> sol(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        list.addAll(sol(root.left));
        list.add(root.val);
        list.addAll(sol(root.right));
        return list;
    }
}
