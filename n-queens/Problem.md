## leetcode - N Queens
- Time: 2014.10.23
- Tags: deepth first search

### Problem Description [link][1]
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where `'Q'` and `'.'` both indicate a queen and an empty space respectively.

For example,
There exist two distinct solutions to the 4-queens puzzle:

```
[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
```

### Solution
```java
import java.util.*;
public class Solution {
    ArrayList<String[]> ans;
    int[] col;
    public ArrayList<String[]> solveNQueens(int n) {
        ans = new ArrayList<String[]>();
        col = new int[n];
        dfs(n, 0, 0, 0, 0);
        return ans;
    }
    
    private void dfs(int n, int i, int dhold, int lhold, int rhold){
        int hold = dhold | lhold | rhold;
        int mask = (1 << n) - 1;
        while ((hold & mask) != mask){
            int pos = ~hold & -~hold;
            hold = hold | pos;
            col[i] = pos;
            if (i < n - 1)
                dfs(n, i + 1, dhold | pos, (lhold | pos) << 1, (rhold | pos) >> 1);
            else
                saveAnswer(n);
        }
    }
    
    private void saveAnswer(int n){
        String[] tmp = new String[n];
        for (int i = 0; i < n; i++){
            StringBuffer s = new StringBuffer(n);
            for (int j = 0; j < n; j++)
                s.append((col[i] >> j) == 1? 'Q' : '.');
            tmp[i] = s.toString();
        }
        ans.add(tmp);
    }
}
```

[1]: https://oj.leetcode.com/problems/n-queens/ "n-queens"

