/**
	leetcode - Remove Duplicates From Sorted Array
	Time: O(n)
	Space: O(n)
*/
public class Solution {
    public static int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int j = 1;
        for (int i = 1; i < A.length; ++i)
            if (A[i] != A[i - 1]) A[j++] = A[i];                
        return j;
    }
}