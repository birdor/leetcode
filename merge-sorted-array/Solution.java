/**
	leetcode - Merge Sorted Array
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.16
*/
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        for (int i = m - 1; i >= 0; i--){
            A[i + n] = A[i];
        }
        for (int i = 0, j = 0, k = 0; i < m || j < n; k++){
            if (i == m || j < n && B[j] < A[i + n]){
                A[k] = B[j];
                j++;
            }else{
                A[k] = A[i + n];
                i++;
            }
        }
    }
}