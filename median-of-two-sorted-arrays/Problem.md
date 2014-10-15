## leetcode - Median Of Two Sorted Arrays
- Time: 2014.10.12
- Tags: hard, divide and conquer

### Problem Description [link][1]
There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).


### Solution
The key is to find the k-th number of the merged array. 

Suppose A_j is the (k/2)th number of A, and B_j is the (k/2)th number of B, which makes C = [A_0 .. A_j, B_0 .. B_j]
have a size of k numbers. Assume A_j < B_j, then B_j is the maximum of C. 

For any number B_k in B and B_k > B_j, there are at least k number in C less than B_k. So, B_k is not the number we are looking for.

For any number A_k in A and k <= j, there are at most k - 2 number in A and B less than A_k, which are A_0 .. A_(j-1) and B_0 .. B_(j-1). Therefore A_k is not the number we are looking for either.

Thereafter, we have ruled out [A_0 .. A_j] and [B_(j+1).. ]. Then we recursively search the rest of two arrays for the (k - (j + 1))th number in the merged array. Since we ruled out half of the merged array, the algorithm has a speed of O(log (n + m)).

```java
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
```

[1]: https://oj.leetcode.com/problems/median-of-two-sorted-arrays/ "median-of-two-sorted-arrays"

