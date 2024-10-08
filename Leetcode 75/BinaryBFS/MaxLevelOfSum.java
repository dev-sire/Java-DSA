package BinaryBFS;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class MaxLevelOfSum {
    public int maxLevelSum(TreeNode root) {
        List<Integer> levelSums = new ArrayList<>();
        dfs(root, 0, levelSums);
        return 1 + IntStream.range(0, levelSums.size())
            .reduce(0, (a,b) -> levelSums.get(a) < levelSums.get(b) ? b : a);
    }
    private void dfs(TreeNode root, int level, List<Integer> levelSums){
        if(root == null)
            return;

        if(levelSums.size() == level){
            levelSums.add(0);
        }
        levelSums.set(level, levelSums.get(level) + root.val);
        dfs(root.left, level + 1, levelSums);
        dfs(root.right, level + 1, levelSums);
    }
}