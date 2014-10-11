/**
	leetcode - Decode Ways
	Time: O(n)
	Space: O(n)
	Completed: 2014.09.30
*/



public class Solution {
    public int numDecodings(String s) {
    	if (s.isEmpty() || s.charAt(0) == '0') return 0;
        int[] count = new int[s.length() + 1];
        count[0] = count[1] = 1;
        for (int i = 2; i <= s.length(); i++){
        	count[i] = s.charAt(i - 1) == '0' ? 0 : count[i - 1];
        	int tmp = Integer.parseInt(s.substring(i - 2, i));
        	if (s.charAt(i - 2) != '0' && tmp > 0 && tmp <= 26)
        		count[i] += count[i - 2];
        	if (tmp == 0)
        		return 0;
        }
        return count[s.length()];
    }
}