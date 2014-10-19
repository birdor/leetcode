/**
	leetcode - Subsets
	Time: O(2^n)
	Space: O(n*2^n)
	Completed: 2014.10.19
*/
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        int N = S.length;
        for (int bits = 0; bits < (1 << N); bits++){
            ArrayList<Integer> subset = new ArrayList<Integer>();
            for (int i = 0; i < N; i++){
                if (((bits >> i) & 1) > 0){
                    subset.add(S[i]);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }
}