/**
	leetcode - Median Of Two Sorted Arrays
	Time: O(log(n))
	Space: O(1)
	Completed: 2014.10.12
*/
public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int N = A.length + B.length;
        double mid = getKth(N / 2 + 1, A, 0, A.length, B, 0, B.length);
        return (N % 2 == 1) ? mid : (mid + getKth(N / 2, A, 0, A.length, B, 0, B.length)) / 2;
    }

    public double getKth(int k, int A[], int ai, int alen, int B[], int bi, int blen){
        if (alen > blen)
            return getKth(k, B, bi, blen, A, ai, alen);
        if (alen == 0)
            return B[bi - 1 + k];
        if (k == 1)
            return Math.min(A[ai], B[bi]);
        int aseg = Math.min(k/2, alen), bseg = k - aseg;
        if (A[ai + aseg - 1] < B[bi + bseg - 1]){
            return getKth(k - aseg, A, ai + aseg, alen - aseg, B, bi, bseg);
        }else{
            return getKth(k - bseg, A, ai, aseg, B, bi + bseg, blen - bseg);
        }
    }
}