/**
	leetcode - Gas Station
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.21 
*/
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, sum = 0, j = n - 1;
        for (int i = 0; i <= j; i++){
            sum += gas[i] - cost[i];
            while (sum < 0 && i < j){
                sum += gas[j] - cost[j];
                j = (j - 1 + n) % n;
            }
        }
        return (sum >= 0)? (j + 1) % n : -1;
    }
}