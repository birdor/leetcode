/**
	leetcode - Maximum Subarray
	Time: O(n)
	Space: O(1)
	Completed: 2014.11.04
*/
public class Solution {
    public int maxSubArray(int[] A) {
        int sum = 0, max = -Integer.MIN_VALUE;
        for (int a : A){
            sum = (sum + a < 0)? 0 : sum + a;
            max = Math.max(max, sum);
        }
        if (max == 0){
            if (A.length > 0){
                max = A[0];
            }
            for (int a : A){
                max = Math.max(max, a);
            }
        }
        return max;
    }
}