/**
	leetcode - Unique Binary Search Trees
	Time: O(n^2)
	Space: O(n)
	Completed: 2014.11.07
*/
public class Solution {
    public int numTrees(int n) {
        int[] sum = new int[n + 1];
        sum[0] = 1;
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++){
                sum[i] += sum[j] * sum[i - 1 - j];
            }
        }
        return sum[n];
    }
}