/**
	leetcode - Remove Duplicates From Sorted Array Ii
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.30
*/
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0){
            return A.length;
        }
        int count = 1;
        int len = 1;
        for (int i = 1; i < A.length; i++){
            count = (A[i] == A[i - 1])? count + 1 : 1;
            if (count <= 2){
                A[len++] = A[i];
            }
        }
        return len;
    }
}