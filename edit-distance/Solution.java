/**
	leetcode - Edit Distance
	Time: O(n^2)
	Space: O(n^2)
	Completed: 2015.1.6
*/
public class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int[][] d = new int[len1 + 1][len2 + 1];
        for (int j = 1; j <= len2; j++){
            d[0][j] = j;
        }
        for (int i = 1; i <= len1; i++){
            d[i][0] = i;
            for (int j = 1; j <= len2; j++){
                d[i][j] = Math.min(d[i - 1][j], d[i][j - 1]) + 1;
                d[i][j] = Math.min(d[i][j], d[i - 1][j - 1] + ((word1.charAt(i - 1) == word2.charAt(j - 1))? 0 : 1));
            }
        }
        return d[len1][len2];
    }
}