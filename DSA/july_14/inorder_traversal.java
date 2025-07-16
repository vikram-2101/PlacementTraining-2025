import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class inorder_traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        solve(root, list);
        return list;
    }

    public void solve(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        solve(root.left, list);
        list.add(root.val);
        solve(root.right, list);
    }
}