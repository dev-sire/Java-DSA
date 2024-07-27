package Medium;

import java.util.ArrayList;
import java.util.List;

public class BalanceABST {
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        return build(nums, 0, nums.size() - 1);
    }

    private void inorder(TreeNode root, List<Integer> nums) {
        if (root == null)
        return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
    
    private TreeNode build(List<Integer> nums, int l, int r) {
        if (l > r)
        return null;
        final int m = (l + r) / 2;
        return new TreeNode(nums.get(m), build(nums, l, m - 1), build(nums, m + 1, r));
    }
}