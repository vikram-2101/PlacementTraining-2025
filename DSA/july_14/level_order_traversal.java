
import java.util.*;

public class level_order_traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> sublist = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                sublist.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            list.add(sublist);
        }
        return list;
    }

}
