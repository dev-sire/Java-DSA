class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class DiameterOfBinaryTree {
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return ans;
    }

    int maxDepth(TreeNode root){
        if(root == null) return 0;

        final int left = maxDepth(root.left);
        final int right = maxDepth(root.right);
        ans = Math.max(ans, left+right);
        return 1 + Math.max(left, right);
    }
}
