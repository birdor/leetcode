/**
	leetcode - Search In Rotated Sorted Array
	Time: O(logn)
	Space: O(logn)
	Completed: 2014.11.05
*/
public class Solution {
    public int search(int[] A, int target) {
        return (A.length == 0)? -1 : binarySearch(A, target, 0, A.length - 1);
    }
    private int binarySearch(int[] A, int target, int l, int r){
        if (l == r)
            return (A[l] == target) ? l : -1;
        int m = l + (r - l) / 2;
        if (A[l] <= A[m] && target >= A[l] && target <= A[m] || A[l] > A[m] && (target < A[m + 1] || target > A[r])){
            return binarySearch(A, target, l, m);
        }else{
            return binarySearch(A, target, m + 1, r);
        }
    }
}