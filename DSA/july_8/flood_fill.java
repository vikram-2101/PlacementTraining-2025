public class flood_fill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int a = image[sr][sc];
        if (a == color)
            return image;
        solve(image, sr, sc, color, a);
        return image;
    }

    public void solve(int[][] image, int sr, int sc, int color, int a) {
        if (sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0)
            return;
        if (image[sr][sc] != a)
            return;
        image[sr][sc] = color;
        solve(image, sr + 1, sc, color, a);
        solve(image, sr - 1, sc, color, a);
        solve(image, sr, sc - 1, color, a);
        solve(image, sr, sc + 1, color, a);
    }
}