/**
	leetcode - Valid Palindrome
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.20
*/
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = "a" + s + "a";
        int i = 0, j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
            while (!alphanumeric(s.charAt(i))) i++;
            while (!alphanumeric(s.charAt(j))) j--;
        }
        return true;
    }
    private boolean alphanumeric(char c){
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}