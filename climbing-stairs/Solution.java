/**
	leetcode - Climbing Stairs
	Time: O(n)
	Space: O(1)
	Completed: 2014.11.08
*/
public class Solution {
    public int climbStairs(int n) {
        int last1 = 1, last2 = 0;
        for (int i = 0; i < n; i++){
            int tmp = last1 + last2;
            last2 = last1;
            last1 = tmp;
        }
        return last1;
    }
}