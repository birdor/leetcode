/**
	leetcode - Divide Two Integers
	Time: O(n^2)
	Space: O(n)
	Completed: 2014.10.22
*/
public class Solution {
    private static final int MAX_BITS = 32;
    public int divide(int dividend, int divisor) {
        long a = Math.abs((long)dividend), b = Math.abs((long)divisor);
        long ans = 0, i = 0;
        while (b <= a){
            for (i = 0; i < MAX_BITS; i++){
                if ((b << i) > a){
                    break;
                }
            }
            ans += 1 << (i - 1);
            a -= (b << (i - 1));
        }
        return (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0)? (int) ans : (int)-ans;
    }
}