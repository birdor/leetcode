/**
	leetcode - First Missing Positive
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.22
*/
public class Solution {
    public int firstMissingPositive(int[] A) {
        for (int i = 0; i < A.length; i++){
            int j = A[i];
            A[i] = 0;
            while (j >= 1 && j <= A.length && A[j - 1] != j){
                int tmp = A[j - 1];
                A[j - 1] = j;
                j = tmp;
            }
        }
        int i;
        for (i = 0; i < A.length; i++){
            if (A[i] != i + 1)
                break;
        }
        return i + 1;
    }
}