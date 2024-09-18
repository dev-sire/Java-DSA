package BinaryDFS;

import java.util.ArrayList;
import java.util.List;

public class SimilarLeafTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leave1 = new ArrayList<>();
        List<Integer> leave2 = new ArrayList<>();
        dfs(root1, leave1);
        dfs(root2, leave2);

        return leave1.equals(leave2);
    }
    public void dfs(TreeNode node, List<Integer> leaves){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            leaves.add(node.val);
            return;
        }
        dfs(node.left, leaves);
        dfs(node.right, leaves);
    }
}