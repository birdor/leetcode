/**
	leetcode - Valid Sudoku
	Time: O(n^2)
	Space: O(n)
	Completed: 2015.1.18
*/
public class Solution {
    static final int N = 9;
    private boolean verify(char c, boolean[] occur){
        if (c >= '1' && c <= '9'){
            occur[c - '1'] = !occur[c - '1'];
            return occur[c - '1'];
        }
        return c == '.';
    }
    public boolean isValidSudoku(char[][] board) {
        boolean[] row = new boolean[N];
        boolean[] col = new boolean[N];
        boolean[] blk = new boolean[N];
        if (board.length == N && board[0].length == N){
            for (int i = 0; i < N; i++){
                Arrays.fill(row, false);
                Arrays.fill(col, false);
                Arrays.fill(blk, false);
                for (int j = 0; j < N; j++){
                    if (!verify(board[i][j], col) || !verify(board[j][i], row) 
                        || !verify(board[(i % 3) * 3 + j % 3][(i / 3) * 3 + j / 3], blk)){
                            return false;
                        }
                }
            }
        }else{
            return false;
        }
        return true;
    }
}