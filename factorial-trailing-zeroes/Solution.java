/**
	leetcode - Factorial Trailing Zeroes
	Time: O(log n)
	Space: O(1)
	Completed: 2015.1.4
*/
public class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        for (int d = n / 5; d > 0; d /= 5){
        	sum += d;
        }
        return sum;
    }
}