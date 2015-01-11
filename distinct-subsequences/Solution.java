/**
	leetcode - Distinct Subsequences
	Time: 
	Space: 
	Completed:
*/
public class Solution {
    public int numDistinct(String S, String T) {
        int n = S.length(), m = T.length();
        if (m == 0){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        int[][] count = new int[n][m];
        count[0][0] = (S.charAt(0) == T.charAt(0))? 1 : 0;
        for (int i = 1; i < n; i++){
            count[i][0] = count[i - 1][0] + (S.charAt(i) == T.charAt(0) ? 1 : 0);
            for (int j = 1; j < m; j++){
                count[i][j] = count[i - 1][j] + count[i - 1][j - 1] * (S.charAt(i) == T.charAt(j) ? 1 : 0);
            }
        }
        return count[n - 1][m - 1];
    }
}