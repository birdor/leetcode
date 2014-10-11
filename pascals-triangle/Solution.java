/**
	leetcode - Pascals Triangle
	Time: O(n^2)
	Space: O(n^2)
	Completed: 2014.10.01
*/

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
    	ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> lastrow, nextrow;
        for (int n = 0; n < numRows; n++){
        	lastrow = n > 0 ? triangle.get(n - 1) : new ArrayList<Integer>();
        	triangle.add(nextrow = new ArrayList<Integer>());
        	for (int i = 0; i <= n; i++)
        		nextrow.add((i == 0 || i == n) ? 1 : lastrow.get(i - 1) + lastrow.get(i));
        }
        return triangle;
    }
}