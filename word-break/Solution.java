/**
	leetcode - Word Break
	Time: O(n^2)
	Space: O(n)
	Completed: 2014.10.12
*/
import java.util.HashSet;
public class Solution {
    public boolean wordBreak(String s, HashSet<String> dict) {
    	boolean[] breakPoint = new boolean[s.length() + 1];
    	breakPoint[0] = true;
        for (int i = 1; i <= s.length(); i++){
        	for (int j = 0; j < i; j++){
        		breakPoint[i] = breakPoint[j] && dict.contains(s.substring(j, i));
        		if (breakPoint[i]) break;
        	}
        }
        return breakPoint[s.length()];
    }
}