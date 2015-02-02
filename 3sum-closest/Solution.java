/**
	leetcode - 3sum Closest
	Time: O(n^2)
	Space: O(1)
	Completed: 2015.1.18
*/
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int n = num.length, ans = num[0] + num[1] + num[2];
        for (int i = 2; i < n; i++){
            int k = i - 1;
            for (int j = 0; j < k; j++){
                ans = update(target, ans, num[i] + num[j] + num[k]);
                while (j < k && num[i] + num[j] + num[k] > target){
                    if (j < --k){
                        ans = update(target, ans, num[i] + num[j] + num[k]);
                    }
                }
            }
        }
        return ans;
    }
    private int update(int target, int ans, int choice){
        return (Math.abs(target - ans) < Math.abs(target - choice))? ans : choice;
    }
}