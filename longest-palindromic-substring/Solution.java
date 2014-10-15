/**
	leetcode - Longest Palindromic Substring
	Time: O(n^2)
	Space: O(n)
	Completed: 2014.10.14
*/
public class Solution {
    public String longestPalindrome(String s) {
    	int maxlen = 0;
    	String ans = "";
        for (int i = 0; i < s.length(); i++){
        	int l, r;
        	for (l = r = i; l >= 0 && r < s.length(); l--, r++)
        		if (s.charAt(l) != s.charAt(r)) break;
        	if (r - l - 1 > maxlen){
        		maxlen = r - l - 1;
        		ans = s.substring(l + 1, r);
        	}
        	for (l = i, r = i + 1; l >= 0 && r < s.length(); l--, r++)
        		if (s.charAt(l) != s.charAt(r)) break;
        	if (r - l - 1 > maxlen){
        		maxlen = r - l - 1;
        		ans = s.substring(l + 1, r);
        	}
        }
        return ans;
    }
}