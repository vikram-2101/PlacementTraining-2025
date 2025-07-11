package DSA.july_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class n_queens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');

        Set<Integer> columns = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>(); // row - col
        Set<Integer> diag2 = new HashSet<>(); // row + col

        backtrack(0, board, solutions, columns, diag1, diag2, n);
        return solutions;
    }

    private void backtrack(int row, char[][] board, List<List<String>> solutions,
            Set<Integer> columns, Set<Integer> diag1, Set<Integer> diag2, int n) {
        if (row == n) {
            solutions.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            // Check column and diagonal conflicts
            if (columns.contains(col) || diag1.contains(row - col) || diag2.contains(row + col))
                continue;

            // Place queen
            board[row][col] = 'Q';
            columns.add(col);
            diag1.add(row - col);
            diag2.add(row + col);

            // Recurse to next row
            backtrack(row + 1, board, solutions, columns, diag1, diag2, n);

            // Backtrack
            board[row][col] = '.';
            columns.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }

    private List<String> constructBoard(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
}
