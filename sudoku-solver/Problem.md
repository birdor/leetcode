## leetcode - Sudoku Solver
- Time: 2014.11.08
- Tags: depth first search, hash table

### Problem Description [link][1]
Write a program to solve a Sudoku puzzle by filling the empty cells.

Empty cells are indicated by the character '.'.

You may assume that there will be only one unique solution.


### Solution
```java
public class Solution {
    static final int N = 9;
    static final int M = 3;
    
    boolean[][] row = new boolean[N][N];
    boolean[][] col = new boolean[N][N];
    boolean[][][] box = new boolean[M][M][N];
    
    public void solveSudoku(char[][] board){
        for (int i = 0; i < N; i++)
            for (int k = 0; k < N; k++){
                row[i][k] = true;
                col[i][k] = true;
                box[i / M][i % M][k] = true;
            }
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (board[i][j] > '0' && board[i][j] <= '9')
                    place(board, i, j, board[i][j] - '1');
        search(board, 0);
    }
    
    private void place(char[][] board, int i, int j, int k){
        board[i][j] = (char)('1' + k);
        row[i][k] = col[j][k] = box[i / M][j / M][k] = false;
    }
    
    private void remove(char[][] board, int i, int j){
        int k = board[i][j] - '1';
        row[i][k] = col[j][k] = box[i / M][j / M][k] = true;
        board[i][j] = '.';
    }
    
    private boolean search(char[][] board, int sn){
        if (sn == N * N)
            return true;
        int i = sn / N, j = sn % N;
        if (board[i][j] == '.'){
            for (int k = 0; k < N; k++){
                if (row[i][k] && col[j][k] && box[i / M][j / M][k]){
                    place(board, i, j, k);
                    if (search(board, sn + 1))
                        return true;
                    remove(board, i, j);
                }
            }
            return false;
        }
        return search(board, sn + 1);
    }
}
```

[1]: https://oj.leetcode.com/problems/sudoku-solver/ "sudoku-solver"

