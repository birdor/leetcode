/**
	leetcode - N Queens
	Time: O(n!)
	Space: O(n!)
	Completed: 2014.10.23
*/
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