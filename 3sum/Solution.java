/**
	leetcode - 3sum
	Time: 
	Space: 
	Completed:
*/
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++){
        	if (i > 0 && num[i] == num[i - 1])
        		continue;
        	for (int j = i + 1, k = num.length - 1; j < k; j++){
        		if (j > i + 1 && num[j] == num[j - 1])
        			continue;
        		while (j < k && num[i] + num[j] + num[k] > 0)
        			k--;
        		if (j < k && num[i] + num[j] + num[k] == 0){
        			ArrayList<Integer> tmp = new ArrayList<Integer>();
        			tmp.add(num[i]);
        			tmp.add(num[j]);
        			tmp.add(num[k]);
        			ans.add(tmp);
        		}
        	}        	
        }
        return ans;
    }
}