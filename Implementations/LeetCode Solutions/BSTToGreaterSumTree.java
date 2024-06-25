public class BSTToGreaterSumTree {
    public class TreeNode {
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
    int val = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root.right != null) bstToGst(root.right);
        
        val = root.val = val + root.val;

        if(root.left != null) bstToGst(root.left);

        return root;
    }
    
}
