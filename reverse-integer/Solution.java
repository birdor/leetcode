/**
	leetcode - Reverse Integer
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.01
*/

public class Solution {
    public int reverse(int x) {
        int ans = 0;
        int num = Math.abs(x);
        while (num != 0){
        	ans = ans * 10 + num % 10;
        	num = num / 10;
        }
        return x >= 0 ? ans : -ans;
    }
}
