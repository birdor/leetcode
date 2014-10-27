/**
	leetcode - Triangle
	Time: 
	Space: 
	Completed:
*/
import java.util.*;
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] sum = new int[n];
        for (int i = 0; i < n; i++){
            if (i > 0)
                sum[i] = triangle.get(i).get(i) + sum[i - 1];
            for (int j = i - 1; j > 0; j--){
                sum[j] = Math.min(sum[j - 1], sum[j]) + triangle.get(i).get(j);
            }
            sum[0] = sum[0] + triangle.get(i).get(0);
        }
        int ans = Integer.MAX_VALUE;
        for (int s : sum)
            ans = Math.min(ans, s);
        return ans;
    }
}