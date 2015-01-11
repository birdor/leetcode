/**
	leetcode - Gray Code
	Time: O(2^n)
	Space: O(2^n)
	Completed: 2015.1.11
*/
import java.util.*;

public class Solution {
    public List<Integer> grayCode(int n) {
        LinkedList<Integer> ans = new LinkedList<Integer>();
        ans.add(0);
        for (int i = 0, k = 1; i < n; k <<= 1, i++){
            LinkedList<Integer> tmp = (LinkedList<Integer>) ans.clone();
            for (Iterator<Integer> it = tmp.descendingIterator(); it.hasNext(); ){
                ans.add(it.next() + k);
            }
        }
        return ans;
    }
}