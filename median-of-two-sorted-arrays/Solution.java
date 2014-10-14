/**
	leetcode - Median Of Two Sorted Arrays
	Time: O(log(n))
	Space: O(n)
	Completed: 2014.10.12
*/
public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
    	// System.out.print("gogogo");
		// int i = (A.length + B.length) / 2;
		// double r3 = getByIndex(0, A, 0, A.length, B, 0, B.length);
		// System.out.println("r3 = " + r3);
    	// if (((A.length + B.length) & 1) > 0){
    	// 	return (getByIndex(i, A, 0, A.length, B, 0, B.length) + getByIndex(i + 1, A, 0, A.length, B, 0, B.length)) / 2;
    	// }else{
    	// 	return getByIndex(i, A, 0, A.length, B, 0, B.length);
    	// }
    	return 0;
    }

    public double getByIndex(int k, int A[], int ai, int alen, int B[], int bi, int blen){
    	System.out.println("k = " + k);
    	for (int i = 0; i < alen; i++) System.out.print(A[ai + i] + " ");
    	System.out.print("\n");
    	for (int i = 0; i < blen; i++) System.out.print(B[bi + i] + " ");
    	System.out.print("\n");

    	if (k == 0) return (double) Math.min(A[ai], B[bi]);
		if (alen > blen) return getByIndex(k, B, bi, blen, A, ai, alen);
		if (alen == 0) return (double) B[bi + k];
		int aj = ai + Math.min(k/2, alen - 1);
		int bj = ai + bi + k - aj;
		if (A[aj] < B[bj]){
			return getByIndex(k - aj + ai, A, aj, alen - aj + ai + 1, B, bi, bj - bi);
		}else{
			return getByIndex(k - bj + ai, B, bj, blen - bj + bi + 1, A, ai, aj - ai);
		}
    }

    public double getKth(int k, int A[], int ai, int alen, int B[] int bi, int blen){
    	
    }
}