package DSA.july_15;

import java.util.*;

public class zigzag_traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return list;
        q.offer(root);
        boolean reverse = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> sublist = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                sublist.add(temp.val);
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            if (reverse) {
                Collections.reverse(sublist);
            }
            reverse = !reverse;
            list.add(sublist);
        }
        return list;
    }
}
