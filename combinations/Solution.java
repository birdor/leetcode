/**
	leetcode - Combinations
	Time: O(n!)
	Space: O(n * n!)
	Completed: 2014.09.27
*/

import java.util.ArrayList;
public class Solution{
    public ArrayList<ArrayList<Integer>> combine(int n, int k){
    	ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> tmp = new ArrayList<Integer>();
    	search(n, k, answer, tmp);
    	return answer;
    }
    public void search(int n, int k, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> tmp){
    	int start = tmp.isEmpty() ? 1 : tmp.get(tmp.size() - 1) + 1;
    	for (int i = start; i <= n; i++) {
    		tmp.add(i);
    		if (tmp.size() == k)
    			ans.add(new ArrayList<Integer>(tmp));
    		else
	    		search(n, k, ans, tmp);
    		tmp.remove(tmp.size() - 1);
    	}
    }
}