package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

public class DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new ArrayList<>();
        Set<Integer> toDeleteSet = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
        dfs(root, toDeleteSet, true, ans);
        return ans;
    }
    private TreeNode dfs(TreeNode root, Set<Integer> toDeleteSet, boolean isRoot,
                List<TreeNode> ans) {
        if (root == null)
            return null;

        final boolean deleted = toDeleteSet.contains(root.val);
        if (isRoot && !deleted)
            ans.add(root);

        // If root is deleted, both children have the possibility to be a new root
        root.left = dfs(root.left, toDeleteSet, deleted, ans);
        root.right = dfs(root.right, toDeleteSet, deleted, ans);
        return deleted ? null : root;
    }
}