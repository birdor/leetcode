/**
	leetcode - Palindrome Number
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.15
*/
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long a = x, b = 0;
        while (x > 0){
            b = b * 10 + x % 10;
            x /= 10;
        }
        return (a == b);
    }
}