public class diameter_ofBt {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        int height = sol(root);
        return ans;
    }

    public int sol(TreeNode root) {
        if (root == null)
            return 0;

        int left = sol(root.left);
        int right = sol(root.right);
        int max = left + right;
        ans = Math.max(ans, max);
        return Math.max(left, right) + 1;
    }
}
