package GraphBFS;

import java.util.Arrays;
import java.util.Queue;
import java.util.ArrayDeque;

public class NearestExitfromMaze {
    public int nearestExit(char[][] maze, int[] entrance) {
        final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        final int m = maze.length;
        final int n = maze[0].length;
        int ans = 0;
        Queue<int[]> q = new ArrayDeque<>(Arrays.asList(new int[] {entrance[0], entrance[1]}));
        boolean[][] seen = new boolean[m][n];
        seen[entrance[0]][entrance[1]] = true;
        while (!q.isEmpty()) {
            ++ans;
            for (int sz = q.size(); sz > 0; --sz) {
                final int i = q.peek()[0];
                final int j = q.poll()[1];
                for (int[] dir : dirs) {
                    final int x = i + dir[0];
                    final int y = j + dir[1];
                    if (x < 0 || x == m || y < 0 || y == n)
                        continue;
                    if (seen[x][y] || maze[x][y] == '+')
                        continue;
                    if (x == 0 || x == m - 1 || y == 0 || y == n - 1)
                        return ans;
                    q.offer(new int[] {x, y});
                    seen[x][y] = true;
                }
            }
        }
        return -1;
    }
}