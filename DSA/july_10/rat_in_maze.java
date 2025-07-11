package DSA.july_10;

import java.util.ArrayList;
import java.util.Collections;

public class rat_in_maze {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        help(maze, maze.length, 0, 0, ans, "");
        Collections.sort(ans);
        return ans;
    }

    public void help(int[][] matrix, int n, int i, int j, ArrayList<String> ans, String temp) {
        if (i < 0 || j < 0 || i == n || j == n || matrix[i][j] == 0)
            return;
        if (i == n - 1 && j == n - 1) {
            ans.add(temp);
            return;
        }
        matrix[i][j] = 0;
        help(matrix, n, i + 1, j, ans, temp + 'D');
        help(matrix, n, i - 1, j, ans, temp + 'U');
        help(matrix, n, i, j + 1, ans, temp + 'R');
        help(matrix, n, i, j - 1, ans, temp + 'L');
        matrix[i][j] = 1;
    }
}
