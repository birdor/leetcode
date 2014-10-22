/**
	leetcode - Powx N
	Time: O(log n)
	Space: O(log n)
	Completed: 2014.10.21
*/
public class Solution {
    public double pow(double x, int n) {
        if (n == 0) return 1;
        double y = pow(x, n / 2);
        return ((n & 1) == 0)? y * y : ((n > 0)? y * y * x : y * y / x);
    }
}