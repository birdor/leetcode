/**
	leetcode - Longest Consecutive Sequence
	Time: 
	Space: 
	Completed:
*/

import java.util.HashSet;

public class Solution {
    public int longestConsecutive(int[] num) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int n : num){
        	hash.add(n);
        }
        int longest = 0, count = 0;
        for (int n : num){
            if (hash.contains(n)){
                count = 0;
                for (int i = n; hash.contains(i); i++){
                    count++;
                    hash.remove(i);
                }
                for (int i = n - 1; hash.contains(i); i--){
                    count++;
                    hash.remove(i);
                }
                longest = longest > count ? longest : count;
            }
        }
        return longest;
    }
}