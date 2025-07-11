package DSA.july_10;

import java.util.ArrayList;
import java.util.List;

public class group_farmland {
    public int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();
        int rows = land.length;
        int cols = land[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (land[i][j] == 1) {
                    int[] bottomRight = dfs(land, i, j);
                    result.add(new int[] { i, j, bottomRight[0], bottomRight[1] });
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    private int[] dfs(int[][] land, int i, int j) {
        int r = i, c = j;
        int rows = land.length;
        int cols = land[0].length;

        while (r + 1 < rows && land[r + 1][j] == 1)
            r++;

        while (c + 1 < cols && land[i][c + 1] == 1)
            c++;

        for (int x = i; x <= r; x++) {
            for (int y = j; y <= c; y++) {
                land[x][y] = 0;
            }
        }

        return new int[] { r, c };
    }
}
