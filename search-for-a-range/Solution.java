/**
	leetcode - Search For A Range
	Time: O(log n)
	Space: O(1)
	Completed: 2015.1.5
*/
public class Solution {
    int indexBelowThresh(int thresh, int l, int r, int[] A){
        if (thresh < A[l]){
            return l - 1;
        }
        int m = l + (r - l) / 2;
        if (l == r){
            return l;
        }else if (A[m] <= thresh){
            return indexBelowThresh(thresh, m + 1, r, A);
        }
        return indexBelowThresh(thresh, l, m, A);
    }
    public int[] searchRange(int[] A, int target) {
        int[] ans = new int[2];
        ans[0] = indexBelowThresh(target - 1, 0, A.length - 1, A) + 1;
        ans[1] = indexBelowThresh(target, 0, A.length - 1, A);
        if (ans[0] > ans[1]){
            ans[0] = ans[1] = -1;
        }
        return ans;
    }
}