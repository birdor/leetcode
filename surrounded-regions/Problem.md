## leetcode - Surrounded Regions
- Time: 2014.10.22
- Tags: broad first search

### Problem Description [link][1]
Given a 2D board containing `'X'` and `'O'`, capture all regions surrounded by `'X'`.

A region is captured by flipping all `'O'`s into `'X'`s in that surrounded region.

For example,
```
X X X X
X O O X
X X O X
X O X X
```
After running your function, the board should be:
```
X X X X
X X X X
X X X X
X O X X
```

### Solution
```java
import java.util.*;
public class Solution {
    private class Position{
        int x;
        int y;
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static final char MARKED = 'F';
    static final char EMPTY = 'O';
    static final char FILLED = 'X';
    public void solve(char[][] board) {
        if (board.length == 0){
            return;
        }
        int n = board.length, m = board[0].length;
        LinkedList<Position> q = new LinkedList<Position>();
        for (int i = 0; i < n; i++){
            addToQueue(board, q, i, 0);
            addToQueue(board, q, i, m - 1);
        }
        for (int j = 0; j < m; j++){
            addToQueue(board, q, 0, j);
            addToQueue(board, q, n - 1, j);
        }
        while (q.size() > 0){
            Position p = q.poll();
            board[p.x][p.y] = MARKED;
            addToQueue(board, q, p.x - 1, p.y);
            addToQueue(board, q, p.x + 1, p.y);
            addToQueue(board, q, p.x, p.y - 1);
            addToQueue(board, q, p.x, p.y + 1);
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++){
                if (board[i][j] == EMPTY)
                    board[i][j] = FILLED;
                if (board[i][j] == MARKED)
                    board[i][j] = EMPTY;
            }
    }
    private void addToQueue(char[][] board, LinkedList<Position> queue, int x, int y){
        if (x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == EMPTY){
            board[x][y] = MARKED;
            queue.add(new Position(x, y));
        }
    }
}
```

[1]: https://oj.leetcode.com/problems/surrounded-regions/ "surrounded-regions"

