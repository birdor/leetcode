/**
	leetcode - Interleaving String
	Time: O(n^2)
	Space: O(n^2)
	Completed: 2014.10.11
*/
public class Solution {
	static final int NCHAR = 256;
    public boolean isInterleave(String s1, String s2, String s3){
    	if (s1.isEmpty()) return s2.equals(s3);
    	if (s2.isEmpty()) return s1.equals(s3);
    	if (s1.length() + s2.length() != s3.length()) return false;
    	boolean[][] status = new boolean[s1.length() + 1][s2.length() + 1];
    	status[0][0] = true;
    	for (int i = 0; i <= s1.length(); i++)
    		for (int j = 0; j <= s2.length(); j++)
    			status[i][j] = status[i][j] || i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1) && status[i - 1][j]
    				|| j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1) && status[i][j - 1];
    	return status[s1.length()][s2.length()];
    }
}